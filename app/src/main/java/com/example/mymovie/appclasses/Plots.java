
package com.example.mymovie.appclasses;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Plots {

    @SerializedName("plot")
    @Expose
    private List<Plot> plot = null;

    public List<Plot> getPlot() {
        return plot;
    }

    public void setPlot(List<Plot> plot) {
        this.plot = plot;
    }

}
