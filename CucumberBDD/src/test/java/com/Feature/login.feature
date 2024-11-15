Feature: Facebook login

Scenario: Login to Facebook with currect credential
    Given User is on the login page
    When title of login page is Facebook
    Then User enters currect UserName and password
    And  User clicks on the login button
 
    