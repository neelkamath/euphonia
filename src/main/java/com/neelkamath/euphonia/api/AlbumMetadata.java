package com.neelkamath.euphonia.api;

public class AlbumMetadata {
    /**
     * Album's name.
     */
    private String album;
    /**
     * The year the album was released in.
     */
    private int released;

    public AlbumMetadata(String album, int released) {
        this.album = album;
        this.released = released;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getReleased() {
        return released;
    }

    public void setReleased(int released) {
        this.released = released;
    }

    @Override
    public String toString() {
        return String.format("Album: %s, Released: %d", album, released);
    }
}
