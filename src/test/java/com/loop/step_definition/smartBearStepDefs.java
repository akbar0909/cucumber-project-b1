package com.loop.step_definition;
import com.loop.pages.SmartBearBasePage;
import com.loop.pages.SmartBearLoginPage;
import com.loop.pages.SmartBearOrderPage;
import com.loop.utilities.BrowserUtils;
import com.loop.utilities.ConfigurationReader;
import com.loop.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.stream.Stream;

public class smartBearStepDefs extends SmartBearBasePage {

    SmartBearLoginPage loginPage =new SmartBearLoginPage();

    SmartBearOrderPage orderPage=new SmartBearOrderPage();


    @Given("user is already logged in and navigated to order page")
    public void user_is_already_logged_in_and_navigated_to_order_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("smart.bear"));
        loginPage.loginSmartBear(ConfigurationReader.getProperty("smart.username"), ConfigurationReader.getProperty("smart.password"));
        Assert.assertTrue(loginPage.webOrders.isDisplayed());
        orderPage.order.click();
        Assert.assertTrue(orderPage.orderHeading.isDisplayed());

    }


    @When("user selects product type {string}")
    public void user_selects_product_type(String product) {
        Select dropdown = new Select(orderPage.product);
        dropdown.selectByValue(product);


    }
    @When("user enters quantity {int}")
    public void user_enters_quantity(Integer quantity) {
        orderPage.quantity.sendKeys(Keys.BACK_SPACE);
        orderPage.quantity.sendKeys(quantity.toString());

    }
    @When("user enters customer name {string}")
    public void user_enters_customer_name(String customerName) {
        orderPage.customerName.sendKeys(customerName);

    }
    @When("user enters street {string}")
    public void user_enters_street(String street) {
        orderPage.street.sendKeys(street);

    }
    @When("user enters city {string}")
    public void user_enters_city(String city) {
        orderPage.city.sendKeys(city);


    }
    @When("user enters state {string}")
    public void user_enters_state(String state) {
        orderPage.state.sendKeys(state);

    }
    @When("user enters zip {string}")
    public void user_enters_zip(String zip) {
        orderPage.zip.sendKeys(zip);

    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String cardType) {
        for (WebElement eachCard : orderPage.card) {
            if (eachCard.getAttribute("value").equals(cardType)) {
                eachCard.click();

//                orderPage.card.stream()
//                        .filter(element-> element.getAttribute("value").equals(cardType))
//                        .findFirst()
//                        .ifPresent(WebElement::click);
            }

        }

    }
    @When("user enters credit car number {string}")
    public void user_enters_credit_car_number(String cardNumber) {
        orderPage.cardNumber.sendKeys(cardNumber);


    }
    @When("user enters expiration date {string}")
    public void user_enters_expiration_date(String exp) {
        orderPage.expiration.sendKeys(exp);

    }
    @When("user enters process order button")
    public void user_enters_process_order_button()  {

      orderPage.processButton.click();

    }
    @Then("user should see {string} in the first row of the table")
    public void user_should_see_in_the_first_row_of_the_table(String name) {

        orderPage.viewAllOrders.click();
        Assert.assertEquals(orderPage.name.getText(), name);

    }


}
