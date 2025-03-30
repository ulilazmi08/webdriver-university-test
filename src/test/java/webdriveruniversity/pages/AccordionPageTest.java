package webdriveruniversity.pages;

import webdriveruniversity.pages.base.BaseTest;
import com.webdriveruniversity.pages.AccordionPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccordionPageTest extends BaseTest {
    @Test
    public void testManualText() throws InterruptedException {
        AccordionPage accordionPage = indexPage.gotToAccordionPage();
        Thread.sleep(2000);
        Assert.assertTrue(accordionPage.isManualTestingTextIsDisplayed(),"Manual Text is Displayed");
    }
    @Test
    public void testCucumberText() throws InterruptedException {
        AccordionPage accordionPage = indexPage.gotToAccordionPage();
        Thread.sleep(2000);
        Assert.assertTrue(accordionPage.isCucumberBDDTextIsDisplayed(),"Manual Text is Displayed");
    }
    @Test
    public void testHiddenText() throws InterruptedException {
        AccordionPage accordionPage = indexPage.gotToAccordionPage();
        Thread.sleep(2000);
        Assert.assertTrue(accordionPage.isHiddenTextAppeared(),"Test Hidden Text");
        Thread.sleep(2000);
    }

}
