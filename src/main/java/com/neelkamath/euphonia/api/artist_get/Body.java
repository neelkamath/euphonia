package com.neelkamath.euphonia.api.artist_get;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Body {

    @SerializedName("artist")
    @Expose
    private Artist_ artist;

    public Artist_ getArtist() {
        return artist;
    }

    public void setArtist(Artist_ artist) {
        this.artist = artist;
    }

}
