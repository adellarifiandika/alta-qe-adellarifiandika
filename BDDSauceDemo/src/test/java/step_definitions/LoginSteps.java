package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private WebDriver webDriver;
    public LoginSteps(){
        super();
        this.webDriver = Hooks.webDriver;

    }
    @Given("User open the website sauce demo")
    public void verifyLogin(){
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyLoginPage());
    }
    @When("User input \"(.*)\" as userName and input \"(.*)\" as password")
    public void inputCredential(String userName, String password){
        LoginPage loginPage = new LoginPage (webDriver);
        loginPage.setUserName(userName);
        loginPage.setPassword(password);
        loginPage.clickLogin();
    }
    @Then("User see error \"(.*)\" on login page")
    public void verifyErrorText(String errorText){
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertEquals(errorText, loginPage.verifyErrorText());
    }

}