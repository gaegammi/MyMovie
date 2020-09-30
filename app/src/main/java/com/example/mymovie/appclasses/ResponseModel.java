
package com.example.mymovie.appclasses;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseModel {

    @SerializedName("Query")
    @Expose
    private String query;
    @SerializedName("KMAQuery")
    @Expose
    private String kMAQuery;
    @SerializedName("TotalCount")
    @Expose
    private Integer totalCount;
    @SerializedName("Data")
    @Expose
    private List<Datum> data = null;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getKMAQuery() {
        return kMAQuery;
    }

    public void setKMAQuery(String kMAQuery) {
        this.kMAQuery = kMAQuery;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

}
