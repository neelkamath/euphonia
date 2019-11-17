package com.neelkamath.euphonia.api;

public class TrackMetadata {
    /**
     * Track's name.
     */
    private String track;
    /**
     * Music's genre.
     */
    private String genre;

    public TrackMetadata(String track, String genre) {
        this.track = track;
        this.genre = genre;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return String.format("Track: %s, Genre: %s", track, genre);
    }
}
