@LoginTest
Feature: Login Page Tests

  Background: User is on login page
    Given User navigates to the login page

  Scenario: User enters valid credentials
    When User enters login name and password
      | SampleTestData123 | Data@123 |
    And Clicks on login button
    Then User should login successfully

  Scenario: User enters invalid credentials
    When User enters login name and password
      | SampleTestdata123 | Daeta@123 |
    And Clicks on login button
    Then Proper error message should be displayed about invalid credentials

  Scenario: User did not enter any data
    When User did not enter any data
    And Clicks on login button
    Then Proper error message should be displayed

  Scenario: User retrive password with valid credentials
    Given User navigates to the forget password
    When User provides login name and email
      | SampleTestData123 | testmail123@abc.com |
    And Submit the data
    Then Success message should appear about password

  Scenario: User retrive password with invalid credentials
    Given User navigates to the forget password
    When User provides login name and email
      | SampleTestData123 | testmail1234@abc.com |
    And Submit the data
    Then Proper error message should appear about invalid credentials

  Scenario: User retrive login name with valid credentials
    Given User navigates to the forget login name
    When User provides last name and email
      | TestName2 | testmail123@abc.com |
    And Submit the data
    Then Success message should appear about login name

  Scenario: User retrive login name with invalid credentials
    Given User navigates to the forget login name
    When User provides last name and email
      | TestName2 | testmail1234@abc.com |
    And Submit the data
    Then Proper error message should appear about invalid credentials
