Feature: Login Test

Scenario: Login to application 
Given user opens chrome Browser
When  user opens the URL "https://petstore.octoperf.com/actions/Catalog.action"
And   Clicks sign in button
Then  user enters username "Shayesta21" and password "j2ee"
And   clicks login button
Then  home page is displayed with title "JPetStore Demo"
When  user clicks on sign out
Then  page title is displayed as "JPetStore Demo "
And   close browser 
