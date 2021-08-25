package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Utils extends BasePage {
    // method for enter text
    public static void enterText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }
    //method for get text
    public static String get_Text_From_Element(By by) {
        return driver.findElement(by).getText();
    }

    // method for click on element
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    //method for url
    public void assertCurrentURL(String url) {
        Assert.assertTrue(driver.getCurrentUrl().equals(url));
    }
    //method for next button
    public static void clickOnNextButton(By by){
        driver.findElement(by).click();

    }
}

