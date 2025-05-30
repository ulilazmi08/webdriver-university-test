package com.ultilities;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class JavaScriptUtility extends Utility{
    public static void scrollToElementJS(By locator){
        WebElement element = driver.findElement(locator);
        String jsScript = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(jsScript, element);
    }
    public static void clickJS (By locator){
        WebElement element = driver.findElement(locator);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }
    public static void switchNewTab(){
        Object[] windowHandles=driver.getWindowHandles().toArray();
        driver.switchTo().window((String) windowHandles[1]);
    }
    public static void doubleClick(By locator){
        Actions act = new Actions(driver);
        WebElement element = driver.findElement(locator);
        act.doubleClick(element).perform();
    }
    public static void waitWindow(By locator){
        WebElement modal = driver.findElement((locator));
        var wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.visibilityOf(modal));
    }
    public static void waitVisibilityOf(By locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public static void fluentWait(By locator){
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public static void clickOkAlert(){
        driver.switchTo().alert().accept();
    }
    public static void clickCancelAlert(){
        driver.switchTo().alert().dismiss();
    }
    public static void getAlertText(){
        driver.switchTo().alert().getText();
    }
    public static void sendKeyAlert(String text){
        driver.switchTo().alert().sendKeys(text);
    }
//    public static void sendTabAlert(){
//        driver.switchTo().alert().sendKeys(Keys.TAB);
//    }

}
