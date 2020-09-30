
package com.example.mymovie.appclasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stat {

    @SerializedName("screenArea")
    @Expose
    private String screenArea;
    @SerializedName("screenCnt")
    @Expose
    private String screenCnt;
    @SerializedName("salesAcc")
    @Expose
    private String salesAcc;
    @SerializedName("audiAcc")
    @Expose
    private String audiAcc;
    @SerializedName("statSouce")
    @Expose
    private String statSouce;
    @SerializedName("statDate")
    @Expose
    private String statDate;

    public String getScreenArea() {
        return screenArea;
    }

    public void setScreenArea(String screenArea) {
        this.screenArea = screenArea;
    }

    public String getScreenCnt() {
        return screenCnt;
    }

    public void setScreenCnt(String screenCnt) {
        this.screenCnt = screenCnt;
    }

    public String getSalesAcc() {
        return salesAcc;
    }

    public void setSalesAcc(String salesAcc) {
        this.salesAcc = salesAcc;
    }

    public String getAudiAcc() {
        return audiAcc;
    }

    public void setAudiAcc(String audiAcc) {
        this.audiAcc = audiAcc;
    }

    public String getStatSouce() {
        return statSouce;
    }

    public void setStatSouce(String statSouce) {
        this.statSouce = statSouce;
    }

    public String getStatDate() {
        return statDate;
    }

    public void setStatDate(String statDate) {
        this.statDate = statDate;
    }

}
