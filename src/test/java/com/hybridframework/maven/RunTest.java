package com.hybridframework.maven;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", tags = "@Smoke,@Sanity",
        format = {"pretty","html:target/cucumber-reports"})

public class RunTest {
}
