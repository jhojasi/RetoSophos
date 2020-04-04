package com.google.www.stepdefinitions;

import com.google.www.exceptions.PossibleExceptions;
import com.google.www.models.CredentialsRestService;
import com.google.www.questions.ResponseRequestMessage;
import com.google.www.tasks.ConsumeRestServiceGorest;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static com.google.www.utils.MessageError.*;
import static net.serenitybdd.screenplay.GivenWhenThen.*;

public class RestServiceStepDefinitionGorest {
    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("The User").can(BrowseTheWeb.with(hisBrowser));
    }
    @Given("^The user was navigated in the web$")
    public void theUserWasNavigatedInTheWeb() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://gorest.co.in/"));
    }
    @When("^User is consuming a service$")
    public void userIsConsumingAService(List<CredentialsRestService> credentialsRestServices) {
        OnStage.theActorInTheSpotlight().attemptsTo(ConsumeRestServiceGorest.in(credentialsRestServices.get(0)));
    }
    @Then("^The user will see a first name: (.*)$")
    public void theUserWillSeeAFirstNameJhojasi(String message) {
        OnStage.theActorInTheSpotlight().should(seeThat(ResponseRequestMessage.contain(),
                Matchers.containsString(message)).orComplainWith(PossibleExceptions.class, DATA_NOT_FOUND));
    }
}