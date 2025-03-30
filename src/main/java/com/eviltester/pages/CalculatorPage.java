package com.eviltester.pages;

import org.openqa.selenium.By;

import static com.ultilities.DropDownUtility.selectByVisibleText;
import static com.ultilities.JavaScriptUtility.scrollToElementJS;

public class CalculatorPage extends IndexPage{
    private By inputNumber1 = By.xpath("//div//input[@id='number1']");
    private By inputNumber2 = By.xpath("//div//input[@id='number2']");
    private By calculateButton = By.xpath("//div//input[@id='calculate']");
    private By answerDisplau = By.xpath("//div//span[@id='answer']");
    private By functionDropDrown = By.id("function");

    public void setInputNumber1(){
        scrollToElementJS(inputNumber1);
        click(inputNumber1);
        set(inputNumber1,"2");
    }
    public void setInputNumber2(){
        scrollToElementJS(inputNumber2);
        click(inputNumber2);
        set(inputNumber2,"3");
    }
    public void selectFunctionDropDown(String text){
        scrollToElementJS(functionDropDrown);
        click(functionDropDrown);
        selectByVisibleText(functionDropDrown,text);
    }
    public void clickCalculateButton(){
        scrollToElementJS(calculateButton);
        click(calculateButton);
    }
    public boolean isCalculateResultCorrect(String text){
        scrollToElementJS(answerDisplau);
        String answerResult =find(answerDisplau).getText();
        return answerResult.equals(text);
    }

}
