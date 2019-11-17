package com.neelkamath.euphonia.api;

import com.neelkamath.euphonia.api.artist_albums_get.Album;
import com.neelkamath.euphonia.api.artist_albums_get.ArtistAlbums;
import com.neelkamath.euphonia.api.artist_get.Artist;
import com.neelkamath.euphonia.api.artist_search.ArtistList;
import com.neelkamath.euphonia.api.artist_search.Artists;
import com.neelkamath.euphonia.api.track_search.Track;
import com.neelkamath.euphonia.api.track_search.TrackList;
import com.neelkamath.euphonia.api.track_search.Tracks;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Utility functions for the Musixmatch developer API. You can use {@code searchArtists} to get an artist's name and ID.
 */
public class Api {
    private MusixmatchService service;

    public Api() {
        this.service = new Retrofit.Builder()
                .baseUrl("https://api.musixmatch.com/ws/1.1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(MusixmatchService.class);
    }

    /**
     * Searches for artists similar to the query.
     *
     * @param query The artist name to search for.
     */
    public List<ArtistMetadata> searchArtists(String query) throws IOException {
        Artists search = Objects.requireNonNull(service.searchArtists(query).execute().body());
        List<ArtistList> artistList = search.getMessage().getBody().getArtistList();
        List<ArtistMetadata> descriptions = new ArrayList<>();
        for (ArtistList list : artistList)
            descriptions.add(
                    new ArtistMetadata(
                            list.getArtist().getArtistName(),
                            list.getArtist().getArtistComment(),
                            list.getArtist().getArtistId()
                    )
            );
        return descriptions;
    }

    /**
     * Retrieves a random track from an artist.
     *
     * @param artist The name of an artist.
     * @return A random track's metadata from the artist.
     */
    public TrackMetadata getTrackMetadata(String artist) throws IOException {
        Tracks search = Objects.requireNonNull(service.searchTracks(artist).execute().body());
        Track track = getTrack(search.getMessage().getBody().getTrackList());
        return new TrackMetadata(
                track.getTrackName(),
                track.getPrimaryGenres().getMusicGenreList().get(0).getMusicGenre().getMusicGenreName()
        );
    }

    /**
     * Not every Musixmatch track contains a genre. This function will retrieve a track which contains a genre.
     *
     * @param trackLists Tracks to search through.
     */
    private Track getTrack(List<TrackList> trackLists) {
        for (TrackList trackList : trackLists)
            if (!trackList.getTrack().getPrimaryGenres().getMusicGenreList().isEmpty())
                return trackList.getTrack();
        throw new Error("None of the tracks contain a genre.");
    }

    /**
     * Retrieves metadata on a random album from the artist.
     *
     * @param artistId Musixmatch artist ID.
     */
    public AlbumMetadata getAlbumMetadata(int artistId) throws IOException {
        ArtistAlbums search = Objects.requireNonNull(service.searchAlbums(artistId).execute().body());
        Album album = search.getMessage().getBody().getAlbumList().get(0).getAlbum();
        return new AlbumMetadata(album.getAlbumName(), Integer.parseInt(album.getAlbumReleaseDate().substring(0, 4)));
    }

    /**
     * Retrieves which country the artist is from.
     */
    public String getArtistsCountry(int artistId) throws IOException {
        Artist artist = Objects.requireNonNull(service.getArtist(artistId).execute().body());
        return artist.getMessage().getBody().getArtist().getArtistCountry();
    }
}
