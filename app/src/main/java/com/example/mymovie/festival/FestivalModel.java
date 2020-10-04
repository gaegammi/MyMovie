package com.example.mymovie.festival;

public class FestivalModel {
    private String img_url;
    private String title;

    public FestivalModel(String img_url, String title) {
        this.img_url = img_url;
        this.title = title;
    }

    public String getImg_url() {
        return img_url;
    }

    public String getTitle() {
        return title;
    }
}
