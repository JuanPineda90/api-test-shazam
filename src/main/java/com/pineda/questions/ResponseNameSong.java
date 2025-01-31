package com.pineda.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ResponseNameSong implements Question<String> {

    public ResponseNameSong() {
    }

    public static ResponseNameSong is() {
        return new ResponseNameSong();
    }
    @Override
    public String answeredBy(Actor actor) {
        String response = lastResponse().jsonPath().getString("data[0].attributes.name");
        return response;
    }
}
