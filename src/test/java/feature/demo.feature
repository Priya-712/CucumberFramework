

  Feature: Google search page
  Scenario: Search  google
    Given I am on google search page
    When I entered java
    And Click on search
    Then Page titlde must start with java
   

 

   