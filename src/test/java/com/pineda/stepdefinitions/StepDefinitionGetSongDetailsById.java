package com.pineda.stepdefinitions;

import com.pineda.questions.LastResponseStatusCode;
import com.pineda.questions.ResponseNameSong;
import com.pineda.tasks.GetSongRest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;

import static com.pineda.utils.Constant.NAME_SONG;
import static org.hamcrest.Matchers.*;

import static com.pineda.utils.Constant.VALUE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepDefinitionGetSongDetailsById {

    @When("a song is consulted")
    public void a_song_is_consulted(List<String> id) {
        theActorInTheSpotlight().attemptsTo(GetSongRest.withId(id));
    }

    @Then("I can see the song information")
    public void i_can_see_the_song_information() {
        theActorInTheSpotlight().should(seeThat("The song name is" , ResponseNameSong.is(), equalTo(NAME_SONG)));
        theActorInTheSpotlight().should(seeThat("The response code is" , LastResponseStatusCode.is(), equalTo(VALUE)));
    }

}
