package com.co.demoqa.stepsdefinitions;


import com.co.demoqa.steps.DemoQAStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DemoQAStepsDefinitions {
    @Steps
    DemoQAStep demoQAStep;
    @Given("the user is on page demoqa")
    public void theUserIsOnPageDemoqa() {
        demoQAStep.openBrowser();
    }
    @When("The user click on Alerts, Frame and Windows")
    public void theUserClickOnAlertsFrameAndWindows() {
        demoQAStep.clickOptionHomePage();
    }
    @When("Click alerts")
    public void clickAlerts() {
        demoQAStep.clickButtonAlert();
    }
    @Then("Validate fourth alerts")
    public void validateFourthAlerts() {
        demoQAStep.clickOthersAlerts();
    }



}
