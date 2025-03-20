package com.pages;

import com.base.BasePage;
import org.openqa.selenium.By;
import com.ultilities.JavaScriptUtility;
import com.ultilities.DropDownUtility;

import static com.ultilities.JavaScriptUtility.scrollToElementJS;
import static com.ultilities.JavaScriptUtility.switchNewTab;

public class IndexPage extends BasePage {
    private By contactUsSection = By.xpath("//div/h1[text()='CONTACT US']");
    private By loginPortalSection = By.xpath("//div/h1[text()='LOGIN PORTAL']");
    private By buttonClickSection = By.xpath("//div/h1[text()='BUTTON CLICKS']");
    private By datePickerSection = By.xpath("//div/h1[text()='DATEPICKER']");
    private By accordionSection = By.xpath("//div/h1[text()='ACCORDION & TEXT AFFECTS (APPEAR & DISAPPEAR)']");
    private By dropDownSection = By.id("dropdown-checkboxes-radiobuttons");
    private By actionSection = By.id("actions");
    private By holdClick = By.id("click-box");
    private By pageObjectModel = By.id("page-object-model");
    public ContactUs goToContactUsPage(){
        click(contactUsSection);
        return new ContactUs();
    }
    public DropDownPage goToDropDownPage(){
        scrollToElementJS(dropDownSection);
        click(dropDownSection);
        return new DropDownPage();
    }
    public ActionsPage goToActionPage(){
        scrollToElementJS(actionSection);
        click(actionSection);
        return new ActionsPage();
    }
    public PageObjectModel goToPageObjectModel(){
        scrollToElementJS(pageObjectModel);
        click(pageObjectModel);
        return new PageObjectModel();
    }
    public AccordionPage gotToAccordionPage(){
        click(accordionSection);
        return new AccordionPage();
    }

}
