@Sanity
Feature:
  In order to register on www.demo.nopcommerce.com
  As a user
  I want to register successfully using all fields

  Scenario: User clicks on registration page user should see registration form
    Given user is on register page
    When user enters all details
    And user clicks on register button
    Then user should be register successfully

