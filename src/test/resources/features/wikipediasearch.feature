Feature: Wikipedia Search
  User Story: User story: As a user, when I am on the Wikipedia Search page
  I should be able to search whatever I want and see relevant information



  Scenario Outline: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types "<name>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<name>" is in the "<title>"



    Examples:
      | name       |title         |
      | Steve Jobs | wiki title   |
      | Steve Jobs | wiki title   |
      | Steve Jobs | image header |
