Feature: Users should see 6 modules under the Photos module
  User Story: As a user I should be able to see 6 modules under Photos module
  -Your photos,Your videos,Favorites,Your folders,Shared with you,Tagged photos

  @wip
  Scenario:
    When user selects the Photos module from the dashboard
    Then the user will see the Your photos module
    And the user will see the Your videos module
    And the user will see the Favorites module
    And the user will see the Your folders module
    And the user will see the Shared with you module
    And the user will see the Tagged photos module