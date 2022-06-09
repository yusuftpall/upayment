Feature: Users should be able to login


  Scenario: Login as a user
    Given the user is on the login page
    When the user enters user information
    Then the user should be able to login