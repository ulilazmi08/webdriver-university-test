package com.webdriveruniversity.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

import static com.ultilities.JavaScriptUtility.*;

public class PageObjectModel extends BasePage {
    private By findOutMoreButton = By.id("button-find-out-more");
    private By findOutMoreModal = By.xpath("//div[@class='modal-footer']//button[text()='Find Out More']");
    private By carouselRight = By.xpath("//div/a[@class='right carousel-control']");
    private By carouselLeft = By.xpath("//div/a[@class='left carousel-control");
    public void checkModal(){
        switchNewTab();
        scrollToElementJS(findOutMoreButton);
        click(findOutMoreButton);
        waitWindow(findOutMoreModal);
        if (find(findOutMoreModal).isDisplayed()){
            System.out.println("Modal is Displayed");
            click(findOutMoreModal);
        } else {
            System.out.println("Modal is Not Displayed");
        }
    }
    public void clickLeftCarousel(){
        switchNewTab();
        scrollToElementJS(carouselLeft);
        click(carouselLeft);
    }
    public void clickRightCarousel(){
        switchNewTab();
        scrollToElementJS(carouselRight);
        click(carouselRight);
    }
}
