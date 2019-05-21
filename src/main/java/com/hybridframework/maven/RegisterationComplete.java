package com.hybridframework.maven;

import org.openqa.selenium.By;

import static com.hybridframework.maven.Utils.assertTextMessage;

public class RegisterationComplete
{
    LoadProp loadProp = new LoadProp();

    private By _registrationComplete = By.cssSelector("[class='result']");

    public  void verifyUserIsRegisteredSuccessfully()
    {
        assertTextMessage("Your registration completed",_registrationComplete);
    }
}
