Feature: Login to page


Scenario: Successful Login with valid credentials
    Given User Launch Chrome browser
    When  User opens URL "https://admin-demo.nopcommerce.com/login"
    And   user enters email as "admin@yourstore.com" and password as "admin"
    And   click on login button
    Then  page title should be "dashboard/nopcommerce administration"
    When  user clicks on log out link
    Then  Page title should be "nopCommerce demo store. Login"  
    And   close browser
