package pages;

import base.BaseTest;
import com.pages.PageObjectModel;
import org.testng.annotations.Test;

public class PageObjectModelTest extends BaseTest {
    @Test
    public void checkModalIsDisplayed() throws InterruptedException {
        PageObjectModel pageObjectModel = indexPage.goToPageObjectModel();
        pageObjectModel.checkModal();
        Thread.sleep(2000);
    }
}
