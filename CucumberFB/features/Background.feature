Feature: Test facebook login credientials
  As a tester i want to test facebook negative login funcuntionality.

  Background: invalid credential
    Given open firefox and start application
    When I enter invalid username and invalid password
    Then user should not be login seccessfully

  Scenario: recover your password
    Then click forget link

  Scenario: click on signup button
    Then click for forget link
    
    Scenario: click on login button
    Then click for login link
    
    Scenario: close browser
    Then close the browser
    
