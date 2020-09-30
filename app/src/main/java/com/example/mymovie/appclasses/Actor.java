
package com.example.mymovie.appclasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Actor {

    @SerializedName("actorNm")
    @Expose
    private String actorNm;
    @SerializedName("actorEnNm")
    @Expose
    private String actorEnNm;
    @SerializedName("actorId")
    @Expose
    private String actorId;

    public String getActorNm() {
        return actorNm;
    }

    public void setActorNm(String actorNm) {
        this.actorNm = actorNm;
    }

    public String getActorEnNm() {
        return actorEnNm;
    }

    public void setActorEnNm(String actorEnNm) {
        this.actorEnNm = actorEnNm;
    }

    public String getActorId() {
        return actorId;
    }

    public void setActorId(String actorId) {
        this.actorId = actorId;
    }

}
