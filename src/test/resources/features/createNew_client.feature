Feature: Create a new client
  User Story: User story: As a user, when I am on adviser of the the system
  I should be able to create a new client and validate that new client created.

    @ak

  Scenario: Login as a adviser create a new client
    Given  login as an advisor
      | username | b1g1_advisor@gmail.com |
      | password | Group1                 |
    When  create a new client
    And   validate that new client created
    And   log out as an advisor
    Then  log as a new client




