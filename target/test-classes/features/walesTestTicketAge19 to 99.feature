
@Age19to99
Feature:To get free NHS treatment in Wales


      Scenario:To verify age over 19 to 99
        Given  User on NHS cost checker tool
        When  User click on start button
        And   User select country wales
        And   Click on next
        And   User type date of birth
        And   User click on next
        And   User select yes live with partner
        And   Click on next
        And   User select yes Do you or your partner claim any benefits or tax credits?
        And   Click on next
        And   User select yes Do you or your partner get paid Universal Credit?
        And   Click on next
        And   User select yes As part of your or your parent's Universal Credit, do you have any of these?
        And   Click on next
        And   User select yes Was the take-home pay used in the last Universal Credit period Amount or less?
        And   Click on next last tab
        Then  User should be able to see treatment message from NHS