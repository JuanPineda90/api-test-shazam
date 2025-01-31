package com.pineda.utils.enums;

public enum RestServices {
    BASE_URL("https://shazam.p.rapidapi.com"),
    GET_SONG("/songs/v2/get-details");

    private String uri;

    RestServices(String uri){
        this.uri = uri;
    }

    @Override
    public String toString(){
        return uri;
    }
}
