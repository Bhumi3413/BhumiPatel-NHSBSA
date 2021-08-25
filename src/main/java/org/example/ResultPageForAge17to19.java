package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ResultPageForAge17to19 extends Utils {
    LoadProperty load_property = new LoadProperty();
    private By _message_Verification = By.cssSelector("h2.heading-large");

    public void verifyFullTimeEductionMessage() {
        //verify assert
        Assert.assertEquals(get_Text_From_Element(_message_Verification), "Based on what you've told us\n" +
                "You get help with NHS costs");
        //print output
        System.out.println(load_property.getProperty("ResultPageForAge17To19"));
    }
}
