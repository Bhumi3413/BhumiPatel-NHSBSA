package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends BasePage {
    //create object for load property
    LoadProperty loadProperty = new LoadProperty();
    //create browserName variable
    String browserName = loadProperty.getProperty("browser");

    public void openBrowser() {
        if (browserName.equalsIgnoreCase("chrome")) {
            // chrome driver from WebDriver manager
            WebDriverManager.chromedriver().setup();
            //create object for chrome driver
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            // firefox driver from WebDriver manager
            WebDriverManager.firefoxdriver().setup();
            //create object for firefox driver
            driver = new FirefoxDriver();
        } else {
            System.out.println("Incorrect browser name " + " " + browserName);
        }
        //maximize the browser window
        driver.manage().window().maximize();
        //Apply implicitlyWait to driver object
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
}
