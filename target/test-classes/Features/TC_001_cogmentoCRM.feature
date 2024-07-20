Feature: Test the CogmentoCRM Application

  Scenario: Validate the Login Functionality
    When user is on login page
    Then user enter valide username and password
    And user click on login button

  Scenario: Validate the Home Page functionality
    Given user is on home page and verify the home page title
    Then user validate the home page logo
    And user validate the home page url
