package com.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

import static com.ultilities.JavaScriptUtility.*;

public class PageObjectModel extends BasePage {
    private By findOutMoreButton = By.id("button-find-out-more");
    private By findOutMoreModal = By.xpath("//div[@class='modal-footer']//button[text()='Find Out More']");

    public void checkModal(){
        switchNewTab();
        scrollToElementJS(findOutMoreButton);
        click(findOutMoreButton);
        waiModalWindow(findOutMoreModal);
        if (find(findOutMoreModal).isDisplayed()){
            System.out.println("Modal is Displayed");
            click(findOutMoreModal);
        } else {
            System.out.println("Modal is Not Displayed");
        }
    }
}
