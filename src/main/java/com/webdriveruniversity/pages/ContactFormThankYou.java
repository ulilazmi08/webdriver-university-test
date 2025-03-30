package com.webdriveruniversity.pages;


import com.base.BasePage;
import org.openqa.selenium.By;

import static com.ultilities.JavaScriptUtility.scrollToElementJS;


public class ContactFormThankYou extends BasePage {
    private By thankYouMessage = By.xpath("//div/h1[text()='Thank You for your Message!']");

    public boolean getThankYouMessage(){
        scrollToElementJS(thankYouMessage);
        return find(thankYouMessage).isDisplayed();
    }
}
