package com.eviltester.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

import static com.ultilities.JavaScriptUtility.scrollToElementJS;

public class IndexPage extends BasePage {
    private By autoGrowPage = By.xpath("//div//a[@id='growonloadchallenge']");
    private By calculatorPage = By.xpath("//div//a[@id='calculatetest']");

    public CalculatorPage clickCalculatorPage (){
        scrollToElementJS(calculatorPage);
        click(calculatorPage);
        return new CalculatorPage();
    }

}
