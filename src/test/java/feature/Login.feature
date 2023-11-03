
Feature: Login feature
  

  
  Scenario: Login with valid credential
    Given I am on login page
     When user entered valid username
    And User entered valid password
    And Click on Login button
    Then User redirect to the homepage
    

 