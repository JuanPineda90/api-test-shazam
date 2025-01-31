package com.pineda.utils.enums;

public enum HadersService {
    RAPIDAPI_KEY("e4b4b54901mshf24560024df418cp1d5d73jsn8c7e70dd8c22"),
    RAPIDAPI_HOST("shazam.p.rapidapi.com");

    private String paramHader;

    HadersService(String paramHader){
        this.paramHader = paramHader;
    }

    @Override
    public String toString(){
        return paramHader;
    }
}
