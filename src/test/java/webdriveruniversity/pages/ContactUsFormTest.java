package webdriveruniversity.pages;

import webdriveruniversity.pages.base.BaseTest;
import com.webdriveruniversity.pages.ContactFormThankYou;
import com.webdriveruniversity.pages.ContactUs;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUsFormTest extends BaseTest {
    @Test
    public void testContactUsForm() throws InterruptedException {
        Thread.sleep(2000);
        ContactUs contactUs = indexPage.goToContactUsPage();
        Thread.sleep(2000);
        contactUs.setFirstNameField("ALKM");
        contactUs.setLastNameField("TRIO");
        contactUs.setEmailField("USER@MAIL.com");
        contactUs.setCommentField("TEST COMMENT");
        ContactFormThankYou contactFormThankYou = contactUs.clickSubmitButton();
        Thread.sleep(2000);
        Assert.assertTrue(contactFormThankYou.getThankYouMessage()," Thank You Message is Displayed");
        Thread.sleep(2000);
    }
}
