package webdriveruniversity.pages;

import webdriveruniversity.pages.base.BaseTest;
import com.webdriveruniversity.pages.DropDownPage;
import org.testng.annotations.Test;

public class IndexTest extends BaseTest {
    @Test
    public void goToDropDownPage() throws InterruptedException {
        DropDownPage dropDownPage = indexPage.goToDropDownPage();
        Thread.sleep(2000);
    }
}
