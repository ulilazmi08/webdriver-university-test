package pages;

import base.BaseTest;
import com.pages.ContactFormThankYou;
import com.pages.ContactUs;
import com.pages.IndexPage;
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
