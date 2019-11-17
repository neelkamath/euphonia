package com.neelkamath.euphonia.api.artist_albums_get;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Body {

    @SerializedName("album_list")
    @Expose
    private List<AlbumList> albumList = null;

    public List<AlbumList> getAlbumList() {
        return albumList;
    }

    public void setAlbumList(List<AlbumList> albumList) {
        this.albumList = albumList;
    }

}
