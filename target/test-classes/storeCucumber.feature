@tag
Feature: Buy a product of the store
  As a user I should be able to buy something
  
 @validCredentials
 Scenario: As a Normal user I should be able to buy something from the store
 	Given The user is in the home page
 	When User click on sign on button
	And User send an email as "test900@hotmail.com"
    And User send password as "test1"
    And User click on Sign in button
    And User go to the home page
    And User click on the Faded Short Sleeve T-shirts item
    And User add to the cart the Faded Short Sleeve T-shirts item
    And User click on Proceed to checkout button
    And User click on the second Proceed to checkout button
    And User add a comment on the box
    And User click on the third Procees to checkout button
    And User accept the Terms of service
    And User click on the fourth Procees to checkout button
    And User choose to pay by bank wire
    And User confirm the order
    Then User should see the order confirmation
    