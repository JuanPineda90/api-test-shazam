package com.pineda.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

public class ResponseNameSong implements Question<String> {

    private final String fieldName;

    public ResponseNameSong(String fieldName) {
        this.fieldName = fieldName;
    }

    public static ResponseNameSong with(String fieldName) {
        return new ResponseNameSong(fieldName);
    }
    @Override
    public String answeredBy(Actor actor) {
        return lastResponse().jsonPath().getString("data[0].attributes."+fieldName);
    }
}
