package com.pineda.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

public class LastResponseStatusCode implements Question<Integer> {

    public LastResponseStatusCode() {
    }
    public static LastResponseStatusCode is() {
        return new LastResponseStatusCode();
    }
    @Override
    public Integer answeredBy(Actor actor) {
        int response = lastResponse().statusCode();
        return response;
    }
}
