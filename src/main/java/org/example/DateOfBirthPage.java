package org.example;

import org.openqa.selenium.By;


public class DateOfBirthPage extends Utils {
    LoadProperty loadProperty = new LoadProperty();
    private By _type_DayOfBirth = By.cssSelector("input#dob-day");
    private By _type_MonthOfBirth = By.cssSelector("input#dob-month");
    private By _type_YearOfBirth = By.cssSelector("input#dob-year");


    public void typeDateOfBirth() {
        //expected url
        String url = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/date-of-birth";
        //verifying url
        assertCurrentURL(url);
        //printing output
        System.out.println("Date_Of_Birth_Page assert =" + " " + loadProperty.getProperty("DateOfBirth"));
        //enter  birth date
        enterText(_type_DayOfBirth, loadProperty.getProperty("BirthDate"));
        //enter  birth month
        enterText(_type_MonthOfBirth, loadProperty.getProperty("BirthMonth"));
        //enter  birth year
        enterText(_type_YearOfBirth, loadProperty.getProperty("BirthYear"));

    }

}

