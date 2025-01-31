package com.pineda.tasks;

import com.pineda.interactions.ConsumeService;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

public class GetSongRest implements Task {

    private List<String> id;

    public GetSongRest(List<String> id){
        this.id = id;
    }

    public static GetSongRest withId(List<String> id) {
        return Tasks.instrumented(GetSongRest.class, id);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ConsumeService.withGet(id.get(1)));
    }
}
