Feature: Login to page


Scenario: Successful Login with valid credentials
    Given User Launch Chrome browser
    When  User opens URL "https://admin-demo.nopcommerce.com/login"
    And   user enters email as "admin@yourstore.com" and password as "admin"
    And   click on login button
    Then  page title should be "Dashboard / nopCommerce administration"
    When  user clicks on log out link
    Then  page title2 should be "nopCommerce demo store. Login"
    And   close browser

    
Scenario Outline: Successful Login with valid credentials DataDrivenTest    
    Given User Launch Chrome browser
    When  User opens URL "https://admin-demo.nopcommerce.com/login"
    And   user enters email as "<email>" and password as "<password>"
    And   click on login button
    Then  page title should be "Dashboard / nopCommerce administration"
    When  user clicks on log out link
    Then  page title2 should be "nopCommerce demo store. Login"
    And   close browser
    
Examples:
|email|password|
|admin@yourstore.com|admin|
|mother@yourstore.com|admin|    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    