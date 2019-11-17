package com.neelkamath.euphonia.api;

import com.neelkamath.euphonia.api.artist_albums_get.ArtistAlbums;
import com.neelkamath.euphonia.api.artist_get.Artist;
import com.neelkamath.euphonia.api.artist_search.Artists;
import com.neelkamath.euphonia.api.track_search.Tracks;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

interface MusixmatchService {
    String apiKey = "apikey=8258eb6d168485239d598dbe832381e7";

    @GET("artist.search?" + apiKey)
    Call<Artists> searchArtists(@Query("q_artist") String artist);

    @GET("track.search?" + apiKey)
    Call<Tracks> searchTracks(@Query("q_artist") String artist);

    @GET("artist.albums.get?" + apiKey)
    Call<ArtistAlbums> searchAlbums(@Query("artist_id") int id);

    @GET("artist.get?" + apiKey)
    Call<Artist> getArtist(@Query("artist_id") int artistId);
}