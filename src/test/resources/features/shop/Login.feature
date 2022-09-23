Feature: Login Functionality

  Scenario: Login with valid data
    Given I am already on login page
    When I input username "standard_user"
    And I input password "secret_sauce"
    And I click login button
    Then I redirected to inventory page

#  Scenario: Login with invalid data
#    Given I am already on login page
#    When I input username "not_standar"
#    And I input password "secret_sauce"
#    And I click login button
#    Then error message "can not logged in"