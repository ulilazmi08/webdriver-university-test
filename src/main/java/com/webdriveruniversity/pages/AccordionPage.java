package com.webdriveruniversity.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

import static com.ultilities.JavaScriptUtility.*;

public class AccordionPage extends BasePage {
    private By manualTestingButton = By.xpath("//div/button[@id='manual-testing-accordion']");
    private By manualTestingText = By.xpath("//div[@id='manual-testing-description']/p[text()" +
            "='Manual testing has for some time been the most popular way to test code. For this method, " +
            "the tester plays an important role of end user and verifies that all the features of the application work correctly. " +
            "Manual testing however is on the decline. Companies and developers have realised the efficiency, " +
            "accuracy and cost savings that is possible by adopting the use of automation testing.']");
    private By cucumberBDDButton = By.xpath("//div/button[@id='cucumber-accordion']");
    private By cucumberBDDText = By.xpath("//div[@id='cucumber-testing-description']/p[text()='Cucumber (BDD) simplifies the requirement capturing process. Requirements can be captured, broken down and simplified effortlessly; making the captured requirements readable to anyone within the organisation and in turn providing the required details and backbone to develop accurate test cases also known as ‘Feature Files’.']");

    private By accordionButton = By.xpath("//div/button[@id='click-accordion']");
    private By hiddenText = By.xpath("//div/p[text()='LOADING COMPLETE.']");
    private By accordionText = By.xpath("//div[@id='timeout']");

    public boolean isManualTestingTextIsDisplayed(){
        switchNewTab();
        click(manualTestingButton);
       return find(manualTestingText).isDisplayed();
    }
    public boolean isCucumberBDDTextIsDisplayed(){
        switchNewTab();
        scrollToElementJS(cucumberBDDButton);
        click(cucumberBDDButton);
        return find(cucumberBDDText).isDisplayed();
    }
    public boolean isHiddenTextAppeared(){
        switchNewTab();
        scrollToElementJS(accordionButton);
        click(accordionButton);
        waitVisibilityOf(hiddenText);
        doubleClick(accordionButton);
        return find(hiddenText).isDisplayed();
    }
}
