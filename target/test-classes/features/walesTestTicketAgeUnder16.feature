
@AgeUnder16
Feature:To get free NHS treatment in Wales

  Scenario:To verify person age 16 or under 16 get free treatment from NHS
    Given User on NHS cost checker tool
    When  User click on start button
    And   User select country wales
    And   Click on next
    And   User type date of birth
    And   User click on next
    Then  User should be able to see free treatment message from NHS

