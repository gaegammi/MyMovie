
package com.example.mymovie.appclasses;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Directors {

    @SerializedName("director")
    @Expose
    private List<Director> director = null;

    public List<Director> getDirector() {
        return director;
    }

    public void setDirector(List<Director> director) {
        this.director = director;
    }

}
