
package com.example.mymovie.appclasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Director {

    @SerializedName("directorNm")
    @Expose
    private String directorNm;
    @SerializedName("directorEnNm")
    @Expose
    private String directorEnNm;
    @SerializedName("directorId")
    @Expose
    private String directorId;

    public String getDirectorNm() {
        return directorNm;
    }

    public void setDirectorNm(String directorNm) {
        this.directorNm = directorNm;
    }

    public String getDirectorEnNm() {
        return directorEnNm;
    }

    public void setDirectorEnNm(String directorEnNm) {
        this.directorEnNm = directorEnNm;
    }

    public String getDirectorId() {
        return directorId;
    }

    public void setDirectorId(String directorId) {
        this.directorId = directorId;
    }

}
