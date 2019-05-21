package com.hybridframework.maven;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils
{
    LoadProp loadprop = new LoadProp();

    private By _register = By.xpath("//*[contains(text(),'Your Personal Details')]");
    private By _clickRegister = By.cssSelector("[href='/register']");
    private By _clickGender = By.id("gender-female");
    private By _enterName = By.cssSelector("[name='FirstName']");
    private By _enterLastName = By.id("LastName");
    private By _selectDayOfBirth = By.xpath("//select[@name='DateOfBirthDay']");
    private By _selectMonthOfBirth = By.cssSelector("[name='DateOfBirthMonth']");
    private By _selectYearOfBirth = By.cssSelector("[name='DateOfBirthYear']");
    private By _enterEmailAddress = By.id("Email");
    private By _enterPassword = By.cssSelector("[name='Password']");
    private By _enterConfirmPassword = By.cssSelector("[name='ConfirmPassword']");
    private By _clickRegisterButton = By.id("register-button");

    private static String timestamp = shortDate();

    public void verifyUserIsOnRegisterationPage()
    {
        assertTextMessage("Your Personal Details",_register);
    }


    public void userEntersAllDetails()
    {
        clickElementBy(_clickGender);
        enterText(_enterName, loadprop.getProperty("FirstName"));
        enterText(_enterLastName, loadprop.getProperty("LastName"));
        selectTextByValue(_selectDayOfBirth, loadprop.getProperty("Day"));
        selectVisibleTextBy(_selectMonthOfBirth, loadprop.getProperty("Month"));
        selectTextByValue(_selectYearOfBirth, loadprop.getProperty("Year"));
        enterText(_enterEmailAddress, loadprop.getProperty("text123") + timestamp + "@test.com");
        enterText(_enterPassword, loadprop.getProperty("Password"));
        enterText(_enterConfirmPassword, loadprop.getProperty("ConfirmPassword"));
    }
        public void userShouldBeAbleToClickRegisterButton()
    {
        clickElementBy(_clickRegisterButton);
    }

}
