Feature: Homepage functionality
  As a User I should be able to signup Successfully

  Background: I open the URL
    Given I am on Homepage
    When I accept cookies

  @smoke
  Scenario: Verify that user can login successfully
    When I click on signUp button
    And I enter the FirstName "Shital"
    And I enter the LastName "Sanghani"
    Then I click on continue button
