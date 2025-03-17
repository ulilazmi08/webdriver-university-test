package pages;

import base.BaseTest;
import com.pages.DropDownPage;
import org.testng.annotations.Test;

public class IndexTest extends BaseTest {
    @Test
    public void goToDropDownPage() throws InterruptedException {
        DropDownPage dropDownPage = indexPage.goToDropDownPage();
        Thread.sleep(2000);
    }
}
