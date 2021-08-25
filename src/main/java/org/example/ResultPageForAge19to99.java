package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ResultPageForAge19to99 extends Utils {

    LoadProperty load_property = new LoadProperty();
    private By _message_Verification = By.cssSelector("h2.heading-large");

    public void verifyUserAge19To60Massage() {
        //verify assert
        Assert.assertEquals(get_Text_From_Element(_message_Verification), "Based on what you've told us\n" +
                "You get help with NHS costs", "Type date of birth between 19 to 99 age");
        //print output
        System.out.println(load_property.getProperty("ResultPageForAge19To99"));
    }
}
