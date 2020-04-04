package com.google.www.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/com.google.www.features/rest_service.feature",
        snippets = SnippetType.CAMELCASE ,
        glue = "com.google.www.stepdefinitions",
        dryRun = false)
public class RestService {
}
