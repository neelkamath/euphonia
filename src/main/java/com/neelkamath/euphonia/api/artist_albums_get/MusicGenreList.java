package com.neelkamath.euphonia.api.artist_albums_get;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MusicGenreList {

    @SerializedName("music_genre")
    @Expose
    private MusicGenre musicGenre;

    public MusicGenre getMusicGenre() {
        return musicGenre;
    }

    public void setMusicGenre(MusicGenre musicGenre) {
        this.musicGenre = musicGenre;
    }

}
