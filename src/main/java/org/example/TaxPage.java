package org.example;

import org.openqa.selenium.By;

public class TaxPage extends Utils {
    LoadProperty load_property = new LoadProperty();
    private By _yes_tax = By.cssSelector("label#label-yes");


    public void clickOnTaxCredit() {
        //expected url
        String url = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/claim-benefits-tax-credits";
        //verify url
        assertCurrentURL(url);
        //print output
        System.out.println("Tax_Credits_Page assert =" + " " + load_property.getProperty("TaxCreditsPage"));
        //click yes
        clickOnElement(_yes_tax);


    }
}
