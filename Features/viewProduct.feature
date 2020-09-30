Feature: View Products

Background: Successful login
Given User is on login page 
When User enters username and password
And User clicks on login button


Scenario: Successfully displaying products
Given User is on home page
When User clicks on view products
Then User should able to see all the products
