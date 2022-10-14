Feature: all login scenarios



  @login2
  Scenario: to test the functionality of login button for valid input
    Given I am on login page of billing
    When I enter valid username as and password
    And I click on login button of billing
    Then I should reach to home page of billing


  @login2
  Scenario: to test the functionality of login button for invalid input
    Given I am on login page of billing
    When I enter invalid username as and password
    And I click on login button of billing
    Then I should get error on billing page


  @login2 @blank
  Scenario: to test the functionality of login button for blank input
    Given I am on login page of billing
    When I keep username as and password blank
    And I click on login button of billing
    Then I should get error on billing page
