Feature: End-to-End Data Integrity Validation

  Scenario: create user via API and verify the same data in UI table
    Given I create a new user via the GoREST API
    When I open the AdminLTE contacts page
    And I search for the created user's email in the UI
    Then I should see the user's details in the UI that exactly match the API data
