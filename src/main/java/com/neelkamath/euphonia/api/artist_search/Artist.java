package com.neelkamath.euphonia.api.artist_search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Artist {

    @SerializedName("artist_id")
    @Expose
    private Integer artistId;
    @SerializedName("artist_name")
    @Expose
    private String artistName;
    @SerializedName("artist_name_translation_list")
    @Expose
    private List<ArtistNameTranslationList> artistNameTranslationList = null;
    @SerializedName("artist_comment")
    @Expose
    private String artistComment;
    @SerializedName("artist_country")
    @Expose
    private String artistCountry;
    @SerializedName("artist_alias_list")
    @Expose
    private List<ArtistAliasList> artistAliasList = null;
    @SerializedName("artist_rating")
    @Expose
    private Integer artistRating;
    @SerializedName("artist_twitter_url")
    @Expose
    private String artistTwitterUrl;
    @SerializedName("artist_credits")
    @Expose
    private ArtistCredits artistCredits;
    @SerializedName("restricted")
    @Expose
    private Integer restricted;
    @SerializedName("updated_time")
    @Expose
    private String updatedTime;

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public List<ArtistNameTranslationList> getArtistNameTranslationList() {
        return artistNameTranslationList;
    }

    public void setArtistNameTranslationList(List<ArtistNameTranslationList> artistNameTranslationList) {
        this.artistNameTranslationList = artistNameTranslationList;
    }

    public String getArtistComment() {
        return artistComment;
    }

    public void setArtistComment(String artistComment) {
        this.artistComment = artistComment;
    }

    public String getArtistCountry() {
        return artistCountry;
    }

    public void setArtistCountry(String artistCountry) {
        this.artistCountry = artistCountry;
    }

    public List<ArtistAliasList> getArtistAliasList() {
        return artistAliasList;
    }

    public void setArtistAliasList(List<ArtistAliasList> artistAliasList) {
        this.artistAliasList = artistAliasList;
    }

    public Integer getArtistRating() {
        return artistRating;
    }

    public void setArtistRating(Integer artistRating) {
        this.artistRating = artistRating;
    }

    public String getArtistTwitterUrl() {
        return artistTwitterUrl;
    }

    public void setArtistTwitterUrl(String artistTwitterUrl) {
        this.artistTwitterUrl = artistTwitterUrl;
    }

    public ArtistCredits getArtistCredits() {
        return artistCredits;
    }

    public void setArtistCredits(ArtistCredits artistCredits) {
        this.artistCredits = artistCredits;
    }

    public Integer getRestricted() {
        return restricted;
    }

    public void setRestricted(Integer restricted) {
        this.restricted = restricted;
    }

    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

}
