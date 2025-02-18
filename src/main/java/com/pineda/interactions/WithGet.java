package com.pineda.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static com.pineda.utils.enums.HadersService.RAPIDAPI_HOST;
import static com.pineda.utils.enums.HadersService.RAPIDAPI_KEY;
import static com.pineda.utils.enums.RestServices.GET_SONG;

public class WithGet implements Interaction {

    private final String id;

    public WithGet(String id) {
        this.id = id;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource(String.valueOf(GET_SONG))
                    .with(request -> request
                        .queryParam("id", id)
                        .headers("X-Rapidapi-Key", RAPIDAPI_KEY)
                        .headers("X-RapidAPI-Host", RAPIDAPI_HOST)));
    }
}
