package com.example.filmdottv.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BaseModel <T> {
    @SerializedName("page")
    public int page;
    @SerializedName("results")
    public List<T> results;

    public BaseModel() {
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }
}
