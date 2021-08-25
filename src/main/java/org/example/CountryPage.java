package org.example;

import org.openqa.selenium.By;

public class CountryPage extends Utils {
    LoadProperty loadProperty = new LoadProperty();
    private By _click_Next = By.cssSelector("input#next-button.button");
    private By _radio_Button = By.cssSelector("label#label-wales");

    public void clickOnRadioButton() {
        //expected url
        String url = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/where-you-live";
        //verifying current  url
        assertCurrentURL(url);
        //printing output
        System.out.println("Country_Page assert =" + " " + loadProperty.getProperty("CountryPageSOut"));
        //click on radio button
        clickOnElement(_radio_Button);
    }

    public void clickOnNextButton() {
        //click on next button
        clickOnNextButton(_click_Next);

    }
}
