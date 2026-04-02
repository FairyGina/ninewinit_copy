package com.ninewinit_copy.backend.dto;

public class GenerateRequest {

    private String url;

    public GenerateRequest() {
    }

    public GenerateRequest(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}