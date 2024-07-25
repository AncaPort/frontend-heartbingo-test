package uk.co.heartbingo.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",//take a path of feature package and paste here
        glue = "uk/co/heartbingo/steps",//take a source root path of step package
        plugin = {"html:target/cucumber-reports/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/cucumber-reports/cucumber.json"},
        tags = "@smoke"
)
public class RunCukeTest extends AbstractTestNGCucumberTests {

}
