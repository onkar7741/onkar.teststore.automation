@E2ETest
Feature: Order Product
 
  Scenario: User makes order with login
  	Given User navigates to the login page
    When User enters login name and password
      | SampleTestData123 | Data@123 |
    And Clicks on login button
    Then User should login successfully
    When User selects category
    And Add the product to the cart
    And Checkout order
    Then Order should be placed
    And Proper message should be displyed with order id
    
   Scenario: User makes order without login
		When User selects category
    And Add the product to the cart
    And Checkout order
    Then User should navigate to login page