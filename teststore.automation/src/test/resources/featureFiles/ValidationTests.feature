@ValidationTest
Feature: Validating the the features provided by the site

Background: User should be logged in
		Given User navigates to the login page
    When User enters login name and password
      | SampleTestData123 | Data@123 |
    And Clicks on login button
    Then User should login successfully
    
    Scenario: Check wheather the product details are correct on checkout page
    When User selects category
    And Add the product to the cart
    And Checkout order
    Then Same product should be available on checkout page