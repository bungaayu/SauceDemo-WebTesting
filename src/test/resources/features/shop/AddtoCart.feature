Feature: Add to cart functionality

  Scenario: Add 1 product to cart
    Given I already log in
    When I click add to cart button on products
    Then the product should be added to cart