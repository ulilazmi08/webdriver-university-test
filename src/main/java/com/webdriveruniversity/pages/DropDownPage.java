package com.webdriveruniversity.pages;

import com.base.BasePage;
import org.openqa.selenium.By;
import com.ultilities.JavaScriptUtility;

import static com.ultilities.DropDownUtility.selectByVisibleText;
import static com.ultilities.JavaScriptUtility.*;

public class DropDownPage extends BasePage {
    private By programmingLanguage = By.id("dropdowm-menu-1");
    private By eclipseDropDown = By.id("dropdowm-menu-2");
    private By languageDropDown = By.id("dropdowm-menu-3");
    private By blueRadioButton = By.xpath("//input[@value='blue']");
    private By option3Checkbox = By.xpath("//input[@value='option-3']");
    private By cabbageButton = By.xpath("//input[@value='cabbage']");

    public void selectProgrammingLanguageDropDown(String text){
        switchNewTab();
        scrollToElementJS(programmingLanguage);
        selectByVisibleText(programmingLanguage,text);
    }
    public void selectEclipseDropDown(String text){
        switchNewTab();
        scrollToElementJS(eclipseDropDown);
        selectByVisibleText(eclipseDropDown, text);
    }

    public void selectLanguageDropDrown(String text){
        switchNewTab();
        scrollToElementJS(languageDropDown);
        selectByVisibleText(languageDropDown,text);
    }
    public void clickBlueRadioButton(){
        switchNewTab();
        scrollToElementJS(blueRadioButton);
        clickJS(blueRadioButton);
    }
    public void clickOption3Checkbox(){
        switchNewTab();
        scrollToElementJS(option3Checkbox);
        clickJS(option3Checkbox);
    }
    public boolean isCabbageButtonDisabled(){
        switchNewTab();
        return find(cabbageButton).isEnabled();
    }

}
