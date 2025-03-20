package com.pages;

import org.openqa.selenium.By;
import static com.ultilities.JavaScriptUtility.scrollToElementJS;
import static com.ultilities.JavaScriptUtility.switchNewTab;

public class ContactUs extends IndexPage{
    private By firstNameField = By.xpath("//form/input[@name='first_name']");
    private By lastNameField = By.xpath("//form/input[@name='last_name']");
    private By emailField = By.xpath("//form/input[@name='email']");
    private By commentField = By.xpath("//form/textarea[@name='message']");
    private By submitButton = By.xpath("//div/input[@type='submit']");

    public void setFirstNameField(String text){
        switchNewTab();
        scrollToElementJS(firstNameField);
        click(firstNameField);
        set(firstNameField,text);
    }
    public void setLastNameField(String text){
        scrollToElementJS(lastNameField);
        click(lastNameField);
        set(lastNameField,text);
    }
    public void setEmailField(String text){
        scrollToElementJS(emailField);
        click(emailField);
        set(emailField,text);
    }
    public void setCommentField(String text){
        scrollToElementJS(commentField);
        click(commentField);
        set(commentField,text);
    }
    public ContactFormThankYou clickSubmitButton(){
        scrollToElementJS(submitButton);
        click(submitButton);
        return new ContactFormThankYou();
    }

 }
