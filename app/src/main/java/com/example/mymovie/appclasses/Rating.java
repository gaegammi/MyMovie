
package com.example.mymovie.appclasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rating {

    @SerializedName("ratingMain")
    @Expose
    private String ratingMain;
    @SerializedName("ratingDate")
    @Expose
    private String ratingDate;
    @SerializedName("ratingNo")
    @Expose
    private String ratingNo;
    @SerializedName("ratingGrade")
    @Expose
    private String ratingGrade;
    @SerializedName("releaseDate")
    @Expose
    private String releaseDate;
    @SerializedName("runtime")
    @Expose
    private String runtime;

    public String getRatingMain() {
        return ratingMain;
    }

    public void setRatingMain(String ratingMain) {
        this.ratingMain = ratingMain;
    }

    public String getRatingDate() {
        return ratingDate;
    }

    public void setRatingDate(String ratingDate) {
        this.ratingDate = ratingDate;
    }

    public String getRatingNo() {
        return ratingNo;
    }

    public void setRatingNo(String ratingNo) {
        this.ratingNo = ratingNo;
    }

    public String getRatingGrade() {
        return ratingGrade;
    }

    public void setRatingGrade(String ratingGrade) {
        this.ratingGrade = ratingGrade;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

}
