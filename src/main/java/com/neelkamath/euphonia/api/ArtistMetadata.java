package com.neelkamath.euphonia.api;

public class ArtistMetadata {
    /**
     * Artist's name.
     */
    private String artist;
    /**
     * Short description about the artist. If a description isn't available, this will be empty.
     */
    private String description;
    /**
     * The artist's Musixmatch ID.
     */
    private int id;

    ArtistMetadata(String artist, String description, int id) {
        this.artist = artist;
        this.description = description;
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("Artist: %s, Description: %s, ID: %d", artist, description, id);
    }
}