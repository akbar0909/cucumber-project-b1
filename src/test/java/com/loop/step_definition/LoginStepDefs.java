package com.loop.step_definition;


import io.cucumber.java.en.*;

public class LoginStepDefs {
    @Given("user is on Docuport login page")
    public void user_is_on_docuport_login_page() {
        System.out.println("this is given step");
    }

    @When("user enters username for client")
    public void user_enters_username_for_client() {
        System.out.println("this  is when step");
    }

    @When("user enters password for client")
    public void user_enters_password_for_client() {
        System.out.println("this is when/and");

    }

    @When("use clicks login button")
    public void use_clicks_login_button() {
        System.out.println("this is when/and");
    }

    @Then("user should see the home page for client")
    public void user_should_see_the_home_page_for_client() {
        System.out.println("this  is then step");
    }

    @When("user enters username for employee")
    public void user_enters_username_for_employee() {
        System.out.println("this is given step");

    }

    @When("user enters password for employee")
    public void user_enters_password_for_employee() {
        System.out.println("this is when/and");

    }
    @Then("user should see the home page for employee")
    public void user_should_see_the_home_page_for_employee() {
        System.out.println("this is then step");

    }
}
