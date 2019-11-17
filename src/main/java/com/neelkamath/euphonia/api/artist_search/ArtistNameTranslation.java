package com.neelkamath.euphonia.api.artist_search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ArtistNameTranslation {

    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("translation")
    @Expose
    private String translation;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

}
