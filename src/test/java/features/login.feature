Feature: login
  Scenario: valid login
    Given user is on landingpage
    When user login with valid credentails
    Then User should be able to login succesfully