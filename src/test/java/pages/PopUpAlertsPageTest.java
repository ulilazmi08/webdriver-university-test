package pages;

import base.BaseTest;
import com.pages.PopUpAlertsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PopUpAlertsPageTest extends BaseTest {
    @Test
    public void clickJavaScriptButtonTest() throws InterruptedException {
        PopUpAlertsPage popUpAlertsPage= indexPage.goToPopUpAlertsPage();
        Thread.sleep(2000);
        popUpAlertsPage.clickJavaScriptAlertButton();
        Thread.sleep(2000);
    }
    @Test
    public void  clickJavaScriptConfirmBox () throws InterruptedException {
        PopUpAlertsPage popUpAlertsPage = indexPage.goToPopUpAlertsPage();
        Thread.sleep(2000);
        Assert.assertTrue(popUpAlertsPage.clickJavaScriptConfirmBox());
        Thread.sleep(2000);
    }
}
