package com.upayUpayments.step_definitions;

import com.upayUpayments.pages.LoginPage;
import com.upayUpayments.utilities.BrowserUtils;
import com.upayUpayments.utilities.ConfigurationReader;
import com.upayUpayments.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

        BrowserUtils.waitFor(10);
        String actualUrl = Driver.get().getCurrentUrl();
        Assert.assertEquals("https://upay.upayments.com/auth/login",actualUrl);

    }

    @When("the user enters user information")
    public void the_user_enters_user_information() {

        BrowserUtils.waitFor(10);
        String username = ConfigurationReader.get("Username");
        String password = ConfigurationReader.get("Password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);


    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {

    }

}
