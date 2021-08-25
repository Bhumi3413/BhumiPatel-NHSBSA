package org.example;

import org.openqa.selenium.By;

public class PartnerPage extends Utils {
    LoadProperty load_property = new LoadProperty();
    private By _click_yes_married = By.cssSelector(" label#label-yes");


    public void click_On_Married() {
        //expected url
        String url = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/partner";
        //verify assert
        assertCurrentURL(url);
        //print output
        System.out.println("PartnerPage assert =" + " " + load_property.getProperty("PartnerPage"));
        //click yes
        clickOnElement(_click_yes_married);


    }
}
