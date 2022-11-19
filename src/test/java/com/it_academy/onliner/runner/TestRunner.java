package com.it_academy.onliner.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports/CucumberTestRunner.html",
                "json:target/cucumber-reports/CucumberTestRunner.json",
                "junit:target/cucumber-reports/CucumberTestRunner.xml"},
        monochrome = true,
        tags = "@smoke",
        glue = "com.it_academy.onliner",
        features = "classpath:com/it_academy/onliner/features"
)
public class TestRunner extends AbstractTestNGCucumberTests{
}