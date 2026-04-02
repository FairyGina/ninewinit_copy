package com.ninewinit_copy.backend.dto;

public class GenerateResponse {

    private String message;
    private String url;

    public GenerateResponse() {
    }

    public GenerateResponse(String message, String url) {
        this.message = message;
        this.url = url;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}