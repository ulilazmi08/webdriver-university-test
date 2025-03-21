package com.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

import static com.ultilities.JavaScriptUtility.*;

public class PopUpAlertsPage extends BasePage {
    private By javaScriptAlertButton = By.xpath("//div/span[@id='button1']");
    private By modalPopUpButton = By.xpath("//div/span[@id='button2']");
    private By ajaxLoaderButton = By.xpath("//div/span[@id='button3']");
    private By confirmAlertText = By.xpath("//div/p[@id='confirm-alert-text']");
    private By javaScriptConfirmBox = By.xpath("//div/span[@id='button4']");
    private By closeModalButton = By.xpath("//div[@class='modal-footer']/button");

    public void clickJavaScriptAlertButton (){
        switchNewTab();
        scrollToElementJS(javaScriptAlertButton);
        click(javaScriptAlertButton);
        clickOkAlert();
    }
    public void clickModalButton(){
        switchNewTab();
        scrollToElementJS(modalPopUpButton);
        click(modalPopUpButton);
        waitWindow(closeModalButton);
        click(closeModalButton);
    }
    public boolean clickJavaScriptConfirmBox(){
        switchNewTab();
        scrollToElementJS(javaScriptConfirmBox);
        click(javaScriptConfirmBox);
        clickOkAlert();
        return find(confirmAlertText).isDisplayed();
    }
}
