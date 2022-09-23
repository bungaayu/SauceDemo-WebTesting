Feature: Sorting Functionality
  Scenario Outline: Sorting item
    Given I already log in and add one item to cart
    When I click sort by "<sorting>"
    Then item should be sort by "<sorting>"
    Examples:
      |sorting|
      |Name (Z to A)|