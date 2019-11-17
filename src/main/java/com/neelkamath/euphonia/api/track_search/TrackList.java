package com.neelkamath.euphonia.api.track_search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TrackList {

    @SerializedName("track")
    @Expose
    private Track track;

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

}
