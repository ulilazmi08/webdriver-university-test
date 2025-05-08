package com.eviltester.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

import static com.ultilities.JavaScriptUtility.scrollToElementJS;

public class IndexPage extends BasePage {
    private By autoGrowPage = By.xpath("//div//a[@id='growonloadchallenge']");
    private By calculatorPage = By.xpath("//div//a[@id='calculatetest']");
    private By buttonBasedCalculatorPage = By.xpath("//div//a[@id='calculatetest']");
    private By dragAndDropTestPage = By.id("useractionstest");
    private By authenticationPage = By.id("basicauth");
    private By dynamicButtonPage1 = By.id("button01");


    public CalculatorPage clickCalculatorPage (){
        scrollToElementJS(calculatorPage);
        click(calculatorPage);
        return new CalculatorPage();
    }
    public DragAndDropPage clickDragAndDropTestPage (){
        scrollToElementJS(dragAndDropTestPage);
        click(dragAndDropTestPage);
        return new DragAndDropPage();
    }
    public AuthenticationPage clickAuthenticationPage(){
        scrollToElementJS(authenticationPage);
        click(authenticationPage);
        return new AuthenticationPage();
    }
    public DynamicButtonPage1 clickDynamicButtonPage1(){
        scrollToElementJS(dynamicButtonPage1);
        click(dynamicButtonPage1);
        return new DynamicButtonPage1();
    }

}
