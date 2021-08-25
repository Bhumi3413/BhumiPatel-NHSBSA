package org.example;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Utils {
    //create object for browser selector object
    BrowserSelector browserSelector = new BrowserSelector();

    @Before
    public void OpenBrowser() {
        //open browser
        browserSelector.openBrowser();
        //open URL
        driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
    }

    @After
    public void closeBrowser() {
        //close browser
       // driver.quit();
    }
}
