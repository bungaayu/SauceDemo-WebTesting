Feature: Check Out Functionality
  Scenario: Check Out Products
    Given I already log in
    And I already add products to cart
    When I click Cart icon
    Then I redirected to cart page
    When I click checkout button
    Then I redirected to checkout step one page
    When I input first name "Bunga"
    And I input last name "Ayu"
    And I input postal code "30267"
    And I click continue button
    Then I redirected to checkout step two page
    When I click finish button
    Then I redirected to checkout complete page