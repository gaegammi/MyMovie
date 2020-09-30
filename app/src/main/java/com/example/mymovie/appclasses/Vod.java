
package com.example.mymovie.appclasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Vod {

    @SerializedName("vodClass")
    @Expose
    private String vodClass;
    @SerializedName("vodUrl")
    @Expose
    private String vodUrl;

    public String getVodClass() {
        return vodClass;
    }

    public void setVodClass(String vodClass) {
        this.vodClass = vodClass;
    }

    public String getVodUrl() {
        return vodUrl;
    }

    public void setVodUrl(String vodUrl) {
        this.vodUrl = vodUrl;
    }

}
