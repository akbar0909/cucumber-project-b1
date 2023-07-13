package com.loop.step_definition;

import com.doublechain.common.D;
import com.loop.pages.CreateNewClientPage;
import com.loop.utilities.BrowserUtils;
import com.loop.utilities.ConfigurationReader;
import com.loop.utilities.DocuportConstants;
import com.loop.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.interactions.Actions;

import com.loop.pages.CreateNewClientPage;
import com.loop.utilities.ConfigurationReader;
import com.loop.utilities.DocuportConstants;
import com.loop.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.time.Duration;

public class CreateNewClientStepDefs {

    CreateNewClientPage createNew = new CreateNewClientPage();
    @Given("login as an advisor")
    public void login_as_an_advisor(io.cucumber.datatable.DataTable string) {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
       createNew.userInput.sendKeys(DocuportConstants.USERNAME_ADVISER);
        createNew.passwordIn.sendKeys(DocuportConstants.PASSWORD);
        createNew.loginBut.click();


    }
    @When("create a new client")
    public void create_a_new_client()throws InterruptedException {
//        createNew.linkClients.click();
//        createNew.createNewClientButton.click();
//        createNew.personal.click();
//
//        createNew.firstNameInput.sendKeys(DocuportConstants.FIRST_NAME);
//        createNew.LastNameInput.sendKeys(DocuportConstants.LAST_NAME);
//        createNew.ownerInput.click();
//        BrowserUtils.waitForClickable(createNew.ownerInput,10);
//        createNew.ownerInput.sendKeys(DocuportConstants.Owner);
//        createNew.SelectionRipple.click();
//
//
//        createNew.emailAddressInput.sendKeys(DocuportConstants.Email_ADDRES);
//        createNew.batchGroup.click();
//        BrowserUtils.waitForClickable(createNew.batchGroup,10);
//        createNew.batchGroup1.click();
//        createNew.phoneInput.sendKeys(DocuportConstants.PHONE_NUM);
//        createNew.newPassword.sendKeys(DocuportConstants.PASSWORD);
//        BrowserUtils.waitForClickable(createNew.confirmPassword,10);
//        createNew.confirmPassword.sendKeys(DocuportConstants.PASSWORD);
//
//        BrowserUtils.waitForClickable(createNew.saveButton,10);
//        createNew.saveButton.click();
       //Thread.sleep(3000);


//        createNew.collaborator.click();
////      createNew.collaborator.sendKeys(DocuportConstants.Owner);
//        createNew.address1.sendKeys(DocuportConstants.ADDRESS1_);
//        Thread.sleep(3000);
//        createNew.address2.sendKeys(DocuportConstants.ADDRESS2);
//        createNew.city.sendKeys(DocuportConstants.CITY);
//        createNew.state.sendKeys(DocuportConstants.STATE);
//        createNew.state.sendKeys(DocuportConstants.ZIP_CODE);
//        Thread.sleep(2000);
//        createNew.saveButton1.click();
//
//
   }

        @When("validate that new client created")
        public void validate_that_new_client_created() {


        }
        @When("log out as an advisor")
        public void log_out_as_an_advisor() {
        }


        @Then("log as a new client")
        public void log_as_a_new_client() {

        }









    }





