Feature: all login scenarios

  Scenario: to test the functionality of login button for valid input
    Given I am on login page
    When I enter correct username and correct password
    And I click on login button
    Then I should reach to home page


  Scenario: to test the functionality of login button for invalid input
    Given I am on login page
    When I enter incorrect username and incorrect password
    And I click on login button
    Then I we should get error message
