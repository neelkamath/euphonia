package com.neelkamath.euphonia.api.artist_search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ArtistCredits {

    @SerializedName("artist_list")
    @Expose
    private List<ArtistList_> artistList = null;

    public List<ArtistList_> getArtistList() {
        return artistList;
    }

    public void setArtistList(List<ArtistList_> artistList) {
        this.artistList = artistList;
    }

}
