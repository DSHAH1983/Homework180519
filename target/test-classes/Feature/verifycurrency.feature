@Smoke
Feature: User should be able to verify currency


  Scenario: User should be able to verify default currency as US Dollar

    Given user is on homepage
    And user should be able to see the default currency selected as US Dollar
    Then user should be able to verify the price displayed in US Dollar

   Scenario: User should be able to verify Euro currency
    Given user clicks on US Dollar
    And user selects Euro
    Then user should be able to verify the price displayed in Euro