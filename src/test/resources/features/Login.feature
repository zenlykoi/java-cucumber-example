Feature: Login function

  Scenario: Check login is successfull with valid credentials
    Given browser is open
    And user in login page
    When enter username and password
    And click login button
    Then user is navigated to home page