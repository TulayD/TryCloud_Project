Feature: Files module with 6 other tabs
  User Story : As a user I should be able to see 6 modules under Files module

  @wip
  Scenario: Verify that user can see 6 modules under Files module
    Given that the user is on the dashboard page
    When user clicks on the Files module
    Then user sees six modules on the left of the screen
      | All files         |
      | Recent            |
      | Favorites         |
      | Shares            |
      | Tags              |
      | Shared to Circles |