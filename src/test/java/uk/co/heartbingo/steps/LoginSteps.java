package uk.co.heartbingo.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import uk.co.heartbingo.pages.LoginPage;

import static uk.co.heartbingo.browserfactory.ManageBrowser.driver;

public class LoginSteps {
    @Given("I am on Homepage")
    public void iAmOnHomepage() {
    }

    @When("I accept cookies")
    public void iAcceptCookies() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(By.id("onetrust-accept-btn-handler")));
    }

    @When("I click on signUp button")
    public void iClickOnSignUpButton() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()",driver.findElement(By.cssSelector(".buttons__login_bar--create-account.bvs-button.is-primary")));
    }

    @And("I enter the FirstName {string}")
    public void iEnterTheFirstName(String fName) {
        new LoginPage().enterFirstName(fName);
    }

    @And("I enter the LastName {string}")
    public void iEnterTheLastName(String lName) {
        new LoginPage().enterLastName(lName);
    }

    @Then("I click on continue button")
    public void iClickOnContinueButton() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();",driver.findElement(By.cssSelector("button[type='regpath-button-next']")));
    }
}
