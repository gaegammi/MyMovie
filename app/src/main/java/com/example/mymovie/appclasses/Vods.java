
package com.example.mymovie.appclasses;

import java.util.List;

import com.example.mymovie.appclasses.Vod;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Vods {

    @SerializedName("vod")
    @Expose
    private List<Vod> vod = null;

    public List<Vod> getVod() {
        return vod;
    }

    public void setVod(List<Vod> vod) {
        this.vod = vod;
    }

}
