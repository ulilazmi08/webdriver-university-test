package eviltester;

import com.eviltester.pages.DynamicButtonPage1;
import eviltester.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicButtonTest extends BaseTest {
    @Test
    public void clickDynamicButtonFunctionTest() throws InterruptedException {
        DynamicButtonPage1 dynamicButtonPage1 = indexPage.clickDynamicButtonPage1();
        Thread.sleep(3000);
        dynamicButtonPage1.clickStartButton();
        Thread.sleep(4000);
        dynamicButtonPage1.clickButton01();
        Thread.sleep(4000);
        dynamicButtonPage1.clickButton02();
        Thread.sleep(4000);
        dynamicButtonPage1.clickButton03();
        Thread.sleep(4000);
        Assert.assertTrue(dynamicButtonPage1.isButtonMessageIsDisplayed(),"All Buttons Clicked");
        Thread.sleep(2000);
    }
}
