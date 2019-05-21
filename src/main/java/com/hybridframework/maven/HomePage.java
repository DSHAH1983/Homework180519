package com.hybridframework.maven;

import org.openqa.selenium.By;

public class HomePage extends Utils
{
    LoadProp loadprop = new LoadProp();


    private By _homePage = By.xpath("//div[@class='topic-block-title']/h2");
    private By _usDollar = By.cssSelector("[id='customerCurrency']");
    private By _USDollarSign = By.xpath("//span[contains(text(),'$')]");
    private By _clickUSDollar =By.cssSelector("[name='customerCurrency']");
    private By _euroSign = By.xpath("//span[contains(text(),'Ђ')]");
    private By _clickRegister = By.cssSelector("[href='/register']");

    public void verifyUserOnHomePage()
    {
        Utils.assertTextMessage("Welcome to our store",_homePage);

    }

    public void verifyDollarSignDisplayed()
    {
        webElementDisplayed(_usDollar);
    }

    public void userShouldBeAbleToClickUSDollar()
    {
        clickElementBy(_clickUSDollar);
    }
     public void verifyPriceDisplayedInUSDollar()
    {
        String itemPrice = textGet(_USDollarSign);
        String euroCurrencycSign = itemPrice.substring(0,1);
        verifyPriceIsAscendingOrDescendingOrder(_USDollarSign);
        System.out.println("Price displayed above is in descending to ascending order with '$' sign");
    }

    public void selectEuroUnderDropDownOnHomePage()
    {
        selectVisibleTextBy(_usDollar,"Euro");
    }

    public void verifyUserShouldBeableToSeePriceInEuro()
    {
        String itemPrice = textGet(_euroSign);
        String euroCurrencycSign = itemPrice.substring(0,1);
        verifyPriceIsAscendingOrDescendingOrder(_euroSign);
        System.out.println("Price displayed above is in descending to ascending order with 'Ђ' sign");
    }

    public  void userShouldBeAbleToNavigateToRegister()
    {
        Utils.clickElementBy(_clickRegister);
    }

 }
