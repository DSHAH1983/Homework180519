package com.hybridframework.maven;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.apache.commons.io.FileUtils.copyFile;

public class Hooks extends Utils
{
    BrowserSelector browserSelector = new BrowserSelector();



    @Before
    public void setUpBrowser()
    {
        browserSelector.setUpBrowser();
        driver.get("https://demo.nopcommerce.com/");
    }

    @After
    public void closeBrowser(Scenario scenario)
    {
        if(scenario.isFailed())
        {
            Utils.screenShotCucumber(scenario);
        }
        driver.quit();
} }
