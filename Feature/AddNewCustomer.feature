Feature: Add new Customer

Scenario: Adding a new Customer
Given User Launch Chrome browser
When  User opens URL "https://admin-demo.nopcommerce.com/login"
And   user enters email as "admin@yourstore.com" and password as "admin"
And   click on login button
Then  user can view dashboard
When  user clicks customers menu
And   clicks customers option
And   Add new customer button is clicked
Then  user can view add new customer page
When  user fills all information on form 
And   save button is clicked
Then  user can view success message  as "The new customer has been added successfully" 
And   close browser

