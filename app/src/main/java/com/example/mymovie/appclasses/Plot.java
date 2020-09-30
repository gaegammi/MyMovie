
package com.example.mymovie.appclasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Plot {

    @SerializedName("plotLang")
    @Expose
    private String plotLang;
    @SerializedName("plotText")
    @Expose
    private String plotText;

    public String getPlotLang() {
        return plotLang;
    }

    public void setPlotLang(String plotLang) {
        this.plotLang = plotLang;
    }

    public String getPlotText() {
        return plotText;
    }

    public void setPlotText(String plotText) {
        this.plotText = plotText;
    }

}
