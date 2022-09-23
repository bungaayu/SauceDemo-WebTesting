Feature: Testing All Fitur
  Scenario Outline: Testing Fitur Sorting, Remove, dan Continue
    Given I already log in and add one item to cart
    When I click sorting by "<sorting>"
    Then item should be sorted by "<sorting>"
    When I click Cart icon and I redirected to cart page
    And I click remove button
    And I click continue shopping
    Then I redirected to inventory page
    Examples:
      |sorting|
      |Name (Z to A)|