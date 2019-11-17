package com.neelkamath.euphonia.api.artist_search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Body {

    @SerializedName("artist_list")
    @Expose
    private List<ArtistList> artistList = null;

    public List<ArtistList> getArtistList() {
        return artistList;
    }

    public void setArtistList(List<ArtistList> artistList) {
        this.artistList = artistList;
    }

}
