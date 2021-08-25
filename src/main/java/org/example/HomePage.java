package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    LoadProperty loadProperty = new LoadProperty();
    private By _cookies = By.cssSelector("button#nhsuk-cookie-banner__link_accept");
    private By _start_Button = By.cssSelector(" input#next-button");

    public void clickOnStartButton() {
        //expected url
        String url = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start";
        //verifying url
        assertCurrentURL(url);
        //print output
        System.out.println("HomePage assert =" + " " + loadProperty.getProperty("HomePage"));
        //click on cookies
        clickOnElement(_cookies);
        //click  on start
        clickOnElement(_start_Button);
    }

}
