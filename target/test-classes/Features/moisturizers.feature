@wip
Feature: Selection

  Scenario: Selection of protection
    Given User is on the dashboard
    Then the user checks the temperature
    Then the user navigates to the moisturizers or sunscreens product page according to the temperature
    Then the user selects the products and add them to the cart

