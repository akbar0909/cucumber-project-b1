Feature: Docuport Login Logout Feature

  Background: will run for each scenario first
  Given  user is on Docuport login page
  Then user validates that login button is displayed
  Then user validates that password field is displayed

 @smoke @regression
  Scenario: Login as a client
   When user enters username for client
    And user enters password for client
    And user clicks login button
    Then user should see the home page for client

  @regression
  Scenario: Login as a employee
    When user enters username for employee
    And user enters password for employee
    And user clicks login button
    Then user should see the home page for employee

  @regression
  Scenario: Login as a adviser
    When user enters username for adviser
    And user enters password for adviser
    And user clicks login button
    Then user should see the home page for adviser

  @regression
  Scenario: Login as a admin
    When user enters username for admin
    And user enters password for admin
    And user clicks login button
    Then user should see the home page for admin


@wip

  Scenario: Login as a client map practice
    When user enters credentials
      | username | b1g1_client@gmail.com |
      | password | Group1                |
    Then user should see the home page for client