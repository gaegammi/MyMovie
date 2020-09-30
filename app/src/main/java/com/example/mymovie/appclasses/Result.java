
package com.example.mymovie.appclasses;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("DOCID")
    @Expose
    private String dOCID;
    @SerializedName("movieId")
    @Expose
    private String movieId;
    @SerializedName("movieSeq")
    @Expose
    private String movieSeq;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("titleEng")
    @Expose
    private String titleEng;
    @SerializedName("titleOrg")
    @Expose
    private String titleOrg;
    @SerializedName("titleEtc")
    @Expose
    private String titleEtc;
    @SerializedName("prodYear")
    @Expose
    private String prodYear;
    @SerializedName("directors")
    @Expose
    private Directors directors;
    @SerializedName("actors")
    @Expose
    private Actors actors;
    @SerializedName("nation")
    @Expose
    private String nation;
    @SerializedName("company")
    @Expose
    private String company;
    @SerializedName("plots")
    @Expose
    private Plots plots;
    @SerializedName("runtime")
    @Expose
    private String runtime;
    @SerializedName("rating")
    @Expose
    private String rating;
    @SerializedName("genre")
    @Expose
    private String genre;
    @SerializedName("kmdbUrl")
    @Expose
    private String kmdbUrl;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("use")
    @Expose
    private String use;
    @SerializedName("episodes")
    @Expose
    private String episodes;
    @SerializedName("ratedYn")
    @Expose
    private String ratedYn;
    @SerializedName("repRatDate")
    @Expose
    private String repRatDate;
    @SerializedName("repRlsDate")
    @Expose
    private String repRlsDate;
    @SerializedName("ratings")
    @Expose
    private Ratings ratings;
    @SerializedName("keywords")
    @Expose
    private String keywords;
    @SerializedName("posters")
    @Expose
    private String posters;
    @SerializedName("stlls")
    @Expose
    private String stlls;
    @SerializedName("staffs")
    @Expose
    private Staffs staffs;
    @SerializedName("vods")
    @Expose
    private Vods vods;
    @SerializedName("openThtr")
    @Expose
    private String openThtr;
    @SerializedName("stat")
    @Expose
    private List<Stat> stat = null;
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
    @SerializedName("themeSong")
    @Expose
    private String themeSong;
    @SerializedName("soundtrack")
    @Expose
    private String soundtrack;
    @SerializedName("fLocation")
    @Expose
    private String fLocation;
    @SerializedName("Awards1")
    @Expose
    private String awards1;
    @SerializedName("Awards2")
    @Expose
    private String awards2;
    @SerializedName("regDate")
    @Expose
    private String regDate;
    @SerializedName("modDate")
    @Expose
    private String modDate;
    @SerializedName("Codes")
    @Expose
    private Codes codes;
    @SerializedName("CommCodes")
    @Expose
    private CommCodes commCodes;
    @SerializedName("ALIAS")
    @Expose
    private String aLIAS;

    public Result() {
    }

    public String getDOCID() {
        return dOCID;
    }

    public void setDOCID(String dOCID) {
        this.dOCID = dOCID;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getMovieSeq() {
        return movieSeq;
    }

    public void setMovieSeq(String movieSeq) {
        this.movieSeq = movieSeq;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleEng() {
        return titleEng;
    }

    public void setTitleEng(String titleEng) {
        this.titleEng = titleEng;
    }

    public String getTitleOrg() {
        return titleOrg;
    }

    public void setTitleOrg(String titleOrg) {
        this.titleOrg = titleOrg;
    }

    public String getTitleEtc() {
        return titleEtc;
    }

    public void setTitleEtc(String titleEtc) {
        this.titleEtc = titleEtc;
    }

    public String getProdYear() {
        return prodYear;
    }

    public void setProdYear(String prodYear) {
        this.prodYear = prodYear;
    }

    public Directors getDirectors() {
        return directors;
    }

    public void setDirectors(Directors directors) {
        this.directors = directors;
    }

    public Actors getActors() {
        return actors;
    }

    public void setActors(Actors actors) {
        this.actors = actors;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Plots getPlots() {
        return plots;
    }

    public void setPlots(Plots plots) {
        this.plots = plots;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getKmdbUrl() {
        return kmdbUrl;
    }

    public void setKmdbUrl(String kmdbUrl) {
        this.kmdbUrl = kmdbUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getEpisodes() {
        return episodes;
    }

    public void setEpisodes(String episodes) {
        this.episodes = episodes;
    }

    public String getRatedYn() {
        return ratedYn;
    }

    public void setRatedYn(String ratedYn) {
        this.ratedYn = ratedYn;
    }

    public String getRepRatDate() {
        return repRatDate;
    }

    public void setRepRatDate(String repRatDate) {
        this.repRatDate = repRatDate;
    }

    public String getRepRlsDate() {
        return repRlsDate;
    }

    public void setRepRlsDate(String repRlsDate) {
        this.repRlsDate = repRlsDate;
    }

    public Ratings getRatings() {
        return ratings;
    }

    public void setRatings(Ratings ratings) {
        this.ratings = ratings;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getPosters() {
        return posters;
    }

    public void setPosters(String posters) {
        this.posters = posters;
    }

    public String getStlls() {
        return stlls;
    }

    public void setStlls(String stlls) {
        this.stlls = stlls;
    }

    public Staffs getStaffs() {
        return staffs;
    }

    public void setStaffs(Staffs staffs) {
        this.staffs = staffs;
    }

    public Vods getVods() {
        return vods;
    }

    public void setVods(Vods vods) {
        this.vods = vods;
    }

    public String getOpenThtr() {
        return openThtr;
    }

    public void setOpenThtr(String openThtr) {
        this.openThtr = openThtr;
    }

    public List<Stat> getStat() {
        return stat;
    }

    public void setStat(List<Stat> stat) {
        this.stat = stat;
    }

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

    public String getThemeSong() {
        return themeSong;
    }

    public void setThemeSong(String themeSong) {
        this.themeSong = themeSong;
    }

    public String getSoundtrack() {
        return soundtrack;
    }

    public void setSoundtrack(String soundtrack) {
        this.soundtrack = soundtrack;
    }

    public String getFLocation() {
        return fLocation;
    }

    public void setFLocation(String fLocation) {
        this.fLocation = fLocation;
    }

    public String getAwards1() {
        return awards1;
    }

    public void setAwards1(String awards1) {
        this.awards1 = awards1;
    }

    public String getAwards2() {
        return awards2;
    }

    public void setAwards2(String awards2) {
        this.awards2 = awards2;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getModDate() {
        return modDate;
    }

    public void setModDate(String modDate) {
        this.modDate = modDate;
    }

    public Codes getCodes() {
        return codes;
    }

    public void setCodes(Codes codes) {
        this.codes = codes;
    }

    public CommCodes getCommCodes() {
        return commCodes;
    }

    public void setCommCodes(CommCodes commCodes) {
        this.commCodes = commCodes;
    }

    public String getALIAS() {
        return aLIAS;
    }

    public void setALIAS(String aLIAS) {
        this.aLIAS = aLIAS;
    }

}
