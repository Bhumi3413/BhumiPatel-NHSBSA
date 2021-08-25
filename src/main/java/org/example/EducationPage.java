package org.example;

import org.openqa.selenium.By;


public class EducationPage extends Utils {
    LoadProperty load_property = new LoadProperty();
    private By _education_yes = By.cssSelector("label#label-yes");

    public void clickOnFullTimeEducation() {
        //expected url
        String url = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/full-time-education";
        //verifying url
        assertCurrentURL(url);
        //print output
        System.out.println("EducationPage assert = " + " " + load_property.getProperty("EducationPage"));
        //click on  yes button
        clickOnElement(_education_yes);

    }

}

