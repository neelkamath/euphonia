package com.neelkamath.euphonia.api.artist_search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ArtistNameTranslationList_ {

    @SerializedName("artist_name_translation")
    @Expose
    private ArtistNameTranslation_ artistNameTranslation;

    public ArtistNameTranslation_ getArtistNameTranslation() {
        return artistNameTranslation;
    }

    public void setArtistNameTranslation(ArtistNameTranslation_ artistNameTranslation) {
        this.artistNameTranslation = artistNameTranslation;
    }

}
