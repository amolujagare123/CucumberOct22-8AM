Feature: all login scenarios

  Background: opening browser
    Given I open browser
    And maximize it

  @login
  Scenario: to test the functionality of login button for valid input
    Given I am on login page
   # When I enter correct username and correct password
    When I enter username as "admin" and password as "admin"
    And I click on login button
    Then I should reach to home page

  @login
  Scenario: to test the functionality of login button for invalid input
    Given I am on login page
    #When I enter incorrect username and incorrect password
    When I enter username as "abc" and password as "xyz"
    And I click on login button
    Then I we should get error message

  @login
  Scenario: to test the functionality of login button for blank input
    Given I am on login page
    #When I dont enter username and password
    When I enter username as "" and password as ""
    And I click on login button
    Then I we should get another error message


    @login @paramExampleKeyword
  Scenario Outline: to test the functionality of login button for valid input
    Given I am on login page
    When I enter username as <username> and password as <password> on login page
    And I click on login button
      Examples:
        | username | password    |
        | admin    | admin       |
        | amol     | amol12      |
        | bharath  | bharath123  |
        | indukala | indukala123 |
        | kavitha  | kavitha123  |
        | madhavi  | madhavi123  |


  @userRegistration
    Scenario: to test the functionality of submit button for user reg page
      Given I am on user registration page
      When I enter below data
        | 89898 | 1234 | Madhavi | Latha | xyz | india | 787878 | madhavi123 |
    And I click on submit button
      Then data should be entered
