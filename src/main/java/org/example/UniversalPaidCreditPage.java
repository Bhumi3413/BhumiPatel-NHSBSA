package org.example;

import org.openqa.selenium.By;

public class UniversalPaidCreditPage extends Utils {

    private By _click_yes = By.cssSelector("label#label-yes");


    public void clickOnUniversalCreditLaw() {
        //click on yes
        clickOnElement(_click_yes);


    }
}
