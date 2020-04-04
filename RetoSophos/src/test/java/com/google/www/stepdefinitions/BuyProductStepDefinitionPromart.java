package com.google.www.stepdefinitions;

import com.google.www.exceptions.PossibleExceptions;
import com.google.www.questions.AlertMessage;
import com.google.www.tasks.ChooseProductPromart;
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

import static com.google.www.utils.MessageError.*;
import static net.serenitybdd.screenplay.GivenWhenThen.*;

public class BuyProductStepDefinitionPromart {
    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("The User").can(BrowseTheWeb.with(hisBrowser));
    }
    @Given("^User was navigated for the web$")
    public void userWasNavigatedForTheWeb() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.promart.pe/"));
    }
    @When("^The user is purchasing a product$")
    public void theUserIsPurchasingAProduct() {
        OnStage.theActorInTheSpotlight().attemptsTo(ChooseProductPromart.in());
    }

    @Then("^User will be see a: (.*)$")
    public void userWillBeSeeAElProductoSeAgregoATuCarritoDeCompras(String message) {
        OnStage.theActorInTheSpotlight().should(seeThat(AlertMessage.confirmation(),
                Matchers.containsString(message)).orComplainWith(PossibleExceptions.class, INCORRECT_ALERT_MESSAGE));
    }
}
