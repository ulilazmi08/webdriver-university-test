package com.eviltester.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

import static com.ultilities.JavaScriptUtility.scrollToElementJS;
import static com.ultilities.JavaScriptUtility.waitVisibilityOf;

public class DynamicButtonPage1 extends BasePage {
    private By buttonStart = By.id("button00");
    private By button01=By.id("button01");
    private By button02=By.id("button02");
    private By button03 = By.id("button03");
    private By messageButton = By.xpath("//div/p[text()='All Buttons Clicked']");

    public void clickStartButton(){
        scrollToElementJS(buttonStart);
        click(buttonStart);
    }
    public void clickButton01(){
        scrollToElementJS(button01);
        click(button01);
    }
    public void clickButton02(){
        scrollToElementJS(button02);
        click(button02);
    }
    public void clickButton03(){
        scrollToElementJS(button03);
        click(button03);
    }
    public boolean isButtonMessageIsDisplayed(){
        scrollToElementJS(messageButton);
        waitVisibilityOf(messageButton);
        return find(messageButton).isDisplayed();
    }
}
