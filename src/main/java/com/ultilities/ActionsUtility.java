package com.ultilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;


public class ActionsUtility extends Utility{
    private static Actions act(){
        return new Actions(driver);
    }

    public static void dragAndDropBy(WebElement source, int x, int y){
        act().dragAndDropBy(source, x, y).perform();
    }
    public static void holdClickJS(By locator){
        WebElement clickable = driver.findElement(locator);
        act().clickAndHold(clickable).perform();
    }
    public static void checkBackgroundColor(By locator, Color color){
        WebElement getLocator = driver.findElement(locator);
        Color getBackgroundColor= Color.fromString(getLocator.getCssValue("background-color"));
        assert getBackgroundColor.equals(color);
    }

}
