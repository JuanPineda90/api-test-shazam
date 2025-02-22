package com.pineda.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

public class ResponseTime implements Question<Long> {


    public static ResponseTime is() {
        return new ResponseTime();
    }

    @Override
    public Long answeredBy(Actor actor) {
        return lastResponse().time();
    }
}
