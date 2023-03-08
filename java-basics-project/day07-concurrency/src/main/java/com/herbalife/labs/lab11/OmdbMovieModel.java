package com.herbalife.labs.lab11;

import com.google.gson.annotations.SerializedName;

public class OmdbMovieModel {

    @SerializedName("Title")
    private String title;

    @SerializedName("Year")
    private int year;

    @SerializedName("Response")
    private boolean response;

    @SerializedName("Error")
    private String reason;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isResponse() {
        return response;
    }

    public void setResponse(boolean response) {
        this.response = response;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "OmdbMovieModel{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", response=" + response +
                ", reason='" + reason + '\'' +
                '}';
    }
}
