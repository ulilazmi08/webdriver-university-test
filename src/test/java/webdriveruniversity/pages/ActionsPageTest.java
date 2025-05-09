package webdriveruniversity.pages;

import webdriveruniversity.pages.base.BaseTest;
import com.webdriveruniversity.pages.ActionsPage;
import org.testng.annotations.Test;

public class ActionsPageTest extends BaseTest {
    @Test
    public void testDragItem() throws InterruptedException {
        int x =180;
        int y =0;
        ActionsPage actionsPage = indexPage.goToActionPage();
        actionsPage.moveItem(x,y);
        Thread.sleep(2000);
    }
    @Test
    public void testHoldClick() throws InterruptedException {
        ActionsPage actionsPage = indexPage.goToActionPage();
        actionsPage.holdClickBox();
        Thread.sleep(2000);
    }
    @Test
    public void testDoubleClick() throws InterruptedException {
        ActionsPage actionsPage = indexPage.goToActionPage();
        actionsPage.doubleClickCheck();
        Thread.sleep(2000);
    }

}
