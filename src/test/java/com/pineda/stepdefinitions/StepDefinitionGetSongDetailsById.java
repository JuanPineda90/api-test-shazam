package com.pineda.stepdefinitions;

import com.pineda.questions.LastResponseStatusCode;
import com.pineda.questions.ResponseNameSong;
import com.pineda.tasks.GetSongRest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.pineda.utils.Constant.*;
import static org.hamcrest.Matchers.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepDefinitionGetSongDetailsById {

    @When("realizo una solicitud GET para obtener detalles de la canción con id {string}")
    public void realizo_una_solicitud_get_para_obtener_detalles_de_la_cancion_con_id(String songId) {
        theActorInTheSpotlight().attemptsTo(GetSongRest.withId(songId));
    }

    @Then("el código de estado de la respuesta debe ser 200")
    public void el_codigo_de_estado_de_la_respuesta_debe_ser_200(){
        theActorInTheSpotlight().should(seeThat("El código de respuest es" , LastResponseStatusCode.is(), equalTo(VALUE_200)));
    }

    @Then("el cuerpo de la respuesta debe contener el campo {string} con el valor {string}")
    public void el_cuerpo_de_la_respuesta_debe_contener_el_campo_name_con_el_valor(String fieldName, String expectedTitle) {
        System.out.println(fieldName + " " + expectedTitle);
        theActorInTheSpotlight().should(seeThat("El nombre de la canción es" , ResponseNameSong.with(fieldName), equalTo(expectedTitle)));
    }

}
