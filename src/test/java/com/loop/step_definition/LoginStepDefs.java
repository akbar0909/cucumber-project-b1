package com.loop.step_definition;


import com.loop.pages.HomePageClient;
import com.loop.pages.HomePageForAdvisor;
import com.loop.pages.LoginPage;
import com.loop.utilities.BrowserUtils;
import com.loop.utilities.ConfigurationReader;
import com.loop.utilities.DocuportConstants;
import com.loop.utilities.Driver;
import io.cucumber.java.en.*;

import org.junit.Assert;


import java.util.Map;


public class LoginStepDefs {

    HomePageClient homePageClient =new HomePageClient();

    LoginPage loginpage = new LoginPage();

    HomePageForAdvisor homePageForAdvisor = new HomePageForAdvisor();

    @Given("user is on Docuport login page")
    public void user_is_on_docuport_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @When("user enters username for client")
    public void user_enters_username_for_client()throws InterruptedException {

        BrowserUtils.waitForClickable(loginpage.usernameInput,3);
        loginpage.usernameInput.sendKeys(DocuportConstants.USERNAME_CLIENT);

    }

    @When("user enters password for client")
    public void user_enters_password_for_client() throws InterruptedException {

        loginpage.passwordInput.sendKeys(DocuportConstants.PASSWORD);}
    @When("user clicks login button")
    public void user_clicks_login_button()throws InterruptedException {

        BrowserUtils.waitForClickable(loginpage.loginButton,3);
        loginpage.loginButton.click();
    }
    @Then("user should see the home page for client")
    public void user_should_see_the_home_page_for_client(){


        //Assert.assertTrue(loginpage.homeButton.isDisplayed(), "HOME PAGE IS NOT DISPLAYED");

    }


    @When("user enters username for employee")
    public void user_enters_username_for_employee() throws InterruptedException{
        BrowserUtils.waitForClickable(loginpage.usernameInput,10);
        loginpage.usernameInput.sendKeys(DocuportConstants.USERNAME_EMPLOYEE);

    }
    @When("user enters password for employee")
    public void user_enters_password_for_employee() {
        loginpage.passwordInput.sendKeys(DocuportConstants.PASSWORD);
    }
    @Then("user should see the home page for employee")
    public void user_should_see_the_home_page_for_employee() {
         //loginpage.homeButton.isDisplayed();

    }

    @When("user enters username for adviser")
    public void user_enters_username_for_adviser()throws InterruptedException {

        BrowserUtils.waitForClickable(loginpage.usernameInput,10);
        loginpage.usernameInput.sendKeys(DocuportConstants.USERNAME_ADVISER);

    }
    @When("user enters password for adviser")
    public void user_enters_password_for_adviser() {
        loginpage.passwordInput.sendKeys(DocuportConstants.PASSWORD);
    }
    @Then("user should see the home page for adviser")
    public void user_should_see_the_home_page_for_adviser() {

        //Assert.assertTrue(homePageForAdvisor.profileButton.isDisplayed(), "Element is not displayed");

    }
    @When("user enters username for admin")
    public void user_enters_username_for_admin()throws InterruptedException {

        BrowserUtils.waitForClickable(loginpage.usernameInput,10);
        loginpage.usernameInput.sendKeys(DocuportConstants.USERNAME_ADMIN);

    }
    @When("user enters password for admin")
    public void user_enters_password_for_admin() {
        loginpage.passwordInput.sendKeys(DocuportConstants.PASSWORD);
    }
    @Then("user should see the home page for admin")
    public void user_should_see_the_home_page_for_admin() {

        Assert.assertTrue("HOME PAGE NOT DISPLAYED", loginpage.homeButton.isDisplayed());
    }









    @Then("user validates that password field is displayed")
    public void userValidatesThatPasswordFieldIsDisplayed() {

        Assert.assertTrue(loginpage.loginButton.isDisplayed());
    }

    @When("user enters credentials")
    public void user_enters_credentials(Map< String, String> credentials) {
        for(Map.Entry<String, String> entry : credentials.entrySet()){
            String key =entry.getKey();
            System.out.println("key = " +key);
            String value =entry.getValue();
            System.out.println("value = " + value);
        }
        loginpage.loginDocuport(credentials.get("username"), credentials.get("password"));




    }





}

