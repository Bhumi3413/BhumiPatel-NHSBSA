package org.example;

import org.openqa.selenium.By;


public class UniversalCreditClaimPage extends Utils {
    private By _universal = By.xpath("//label[@for='yes-universal']");

    public void clickOnUniversalCredit() {
        //click on yes
        clickOnElement(_universal);

    }
}
