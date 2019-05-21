package com.hybridframework.maven;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegisterationComplete registerationComplete = new RegisterationComplete();
    @Given("^user is on register page$")
    public void userIsOnRegisterPage() {
        homePage.userShouldBeAbleToNavigateToRegister();
        registrationPage.verifyUserIsOnRegisterationPage();
    }

    @When("^user enters all details$")
    public void userEntersAllDetails() {
        registrationPage.userEntersAllDetails();
    }

    @And("^user clicks on register button$")
    public void userClicksOnRegisterButton() {
        registrationPage.userShouldBeAbleToClickRegisterButton();
    }

    @Then("^user should be register successfully$")
    public void userShouldBeRegisterSuccessfully()
    {
        registerationComplete.verifyUserIsRegisteredSuccessfully();
    }

    @Given("^user is on homepage$")
    public void userIsOnHomepage() {
        homePage.verifyUserOnHomePage();
    }

    @And("^user should be able to see the default currency selected as US Dollar$")
    public void userShouldBeAbleToSeeTheDefaultCurrencySelectedAsUSDollar() {
        homePage.verifyDollarSignDisplayed();
    }


    @Given("^user clicks on US Dollar$")
    public void userClicksOnUSDollar() {
        homePage.userShouldBeAbleToClickUSDollar();
    }

    @And("^user selects Euro$")
    public void userSelectsEuro()
    {
        homePage.selectEuroUnderDropDownOnHomePage();
    }

    @Then("^user should be able to verify the price displayed in Euro$")
    public void userShouldBeAbleToVerifyThePriceDisplayedInEuro()
    {
        homePage.verifyUserShouldBeableToSeePriceInEuro();
    }

    @Then("^user should be able to verify the price displayed in US Dollar$")
    public void userShouldBeAbleToVerifyThePriceDisplayedInUSDollar()
    {
        homePage.verifyPriceDisplayedInUSDollar();
    }

}
