package com.neelkamath.euphonia.api.artist_search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ArtistCredits_ {

    @SerializedName("artist_list")
    @Expose
    private List<Object> artistList = null;

    public List<Object> getArtistList() {
        return artistList;
    }

    public void setArtistList(List<Object> artistList) {
        this.artistList = artistList;
    }

}
