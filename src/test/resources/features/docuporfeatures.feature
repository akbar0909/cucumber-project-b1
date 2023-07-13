Feature: Document  Management
@doc
  Scenario Outline: Validate document functionality for different user roles

    Given user is on Docuport login page
    When user logs in as a "<userName>" and "<password>"
    And user clicks on "Received documents"
    And user should validate "Search" button is displayed
    And user should validate "Download" button is displayed
    And user should validate "Received docs" button is displayed
    Then user clicks on "My upload"
    Then user should validate "Search" button is displayed
    And user should validate "My uploads" button is displayed

    Examples:
      | userName                 | password |
      | b1g1_adviser@gmail.com   | Group1   |
      | b1g1_client@gmail.com    | Group1   |
      | b1g1_employee@gmail.com  | Group1   |
      | b1g1_supervisor@gmail.co | Group1   |
      | b1g1_client@gmail.com    | Group1   |
      | b1g1_client@gmail.com    | Group1   |


