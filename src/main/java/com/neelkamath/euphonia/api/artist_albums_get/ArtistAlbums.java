package com.neelkamath.euphonia.api.artist_albums_get;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ArtistAlbums {

    @SerializedName("message")
    @Expose
    private Message message;

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

}
