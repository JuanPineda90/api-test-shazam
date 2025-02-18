package com.pineda.utils;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import static com.pineda.utils.enums.RestServices.BASE_URL;


public class BeforeHook {
    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Juan").whoCan(CallAnApi.at(BASE_URL.toString()));
    }
}
