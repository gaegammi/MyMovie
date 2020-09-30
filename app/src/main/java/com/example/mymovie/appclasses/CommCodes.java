
package com.example.mymovie.appclasses;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CommCodes {

    @SerializedName("CommCode")
    @Expose
    private List<CommCode> commCode = null;

    public List<CommCode> getCommCode() {
        return commCode;
    }

    public void setCommCode(List<CommCode> commCode) {
        this.commCode = commCode;
    }

}
