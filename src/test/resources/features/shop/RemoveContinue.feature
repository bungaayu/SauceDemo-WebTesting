Feature: Remove item and Continue Shop button
  Scenario: Remove items from cart and Continue Shop button validation
    Given I already log in and add one item to cart
    When I click Cart icon then i redirected to cart page
    And I click button remove
    And I click Continue Shopping button
    Then the page back to the inventory page