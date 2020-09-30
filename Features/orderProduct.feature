Feature: Order Products

Background: Successful login
Given User is on login page 
When User enters username and password
And User clicks on login button
Then User should login succeffully

Scenario: Successful Ordering the products
Given User is on home page
When User searches product from the list of product
And User selects a product
And User click on order product button
Then User should see a message "Product Ordered successfully"

