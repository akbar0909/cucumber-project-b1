package com.loop.step_definition;

import com.loop.pages.ClientPage;
import com.loop.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import org.apache.logging.log4j.*;
import static org.junit.Assert.*;
import org.assertj.core.api.SoftAssertions;



public class ClientStepDefs {
    private final Logger LOG = LogManager.getLogger();
    private final SoftAssertions softAssertions = new SoftAssertions();
    ClientPage clientPage = new ClientPage();

    @When("user validates choose account pop up is visible")
    public void user_validates_choose_account_pop_up_is_visible() {
        BrowserUtils.waitForVisibility(clientPage.chooseAccountText, 5);
//        assertTrue(clientPage.chooseAccountText.isDisplayed());
//        assertTrue(clientPage.chooseAccountText.getText().equals("Choose account"));
//        assert (clientPage.chooseAccountText.getText().equals("Choose account"));
        softAssertions.assertThat(clientPage.chooseAccountText.getText().equals("Choose account")).isTrue();
        LOG.info("Account text is visible");
    }


    @When("user chooses account from drop down")
    public void user_chooses_account_from_drop_down() {
        //    assertTrue(clientPage.continueButton.isDisplayed());

        softAssertions.assertThat(clientPage.continueButton.isDisplayed()).isTrue();
        clientPage.continueButton.click();
        LOG.info("User chooses an account");
        softAssertions.assertAll();
    }

//    @When("user clicks {string} button")
//    public void user_clicks_button(String buttons ) {
//

     //   }

//        clientPage.continueButton.click();
//        clientPage.hiddenButton.click();
//        clientPage.homeButton.click();
//        clientPage.invitationButton.click();


 //   }

}