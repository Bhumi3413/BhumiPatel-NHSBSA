package org.example;

import org.openqa.selenium.By;

public class HomePageCredit extends Utils {
    LoadProperty load_property = new LoadProperty();
    private By _click_yes_homePay = By.cssSelector("label#label-yes");


    public void clickOnYesHomePay() {
        //expected url
        String url = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/universal-credit-take-home-pay";
        //verify url
        assertCurrentURL(url);
        //print output
        System.out.println("Credit Take Home Page assert =" + " " + load_property.getProperty("CreditTakeHomePage"));
        //click yes
        clickOnElement(_click_yes_homePay);


    }


}
