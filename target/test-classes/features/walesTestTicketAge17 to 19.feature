
@Age17to19
  Feature:To get free NHS treatment in Wales

Scenario:To verify age between 17 to 19
Given User on NHS cost checker tool
When  User click on start button
And   User select country wales
And   Click on next
And   User type date of birth
And   User click on next
And   User select yes full time Education
And   Click on next tab
Then  User should be able to see treatment message