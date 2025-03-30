package webdriveruniversity.pages;

import webdriveruniversity.pages.base.BaseTest;
import com.webdriveruniversity.pages.PageObjectModel;
import org.testng.annotations.Test;

public class PageObjectModelTest extends BaseTest {
    @Test
    public void checkModalIsDisplayed() throws InterruptedException {
        PageObjectModel pageObjectModel = indexPage.goToPageObjectModel();
        pageObjectModel.checkModal();
    }
    public void checkClickCarouselRight() throws InterruptedException {
        PageObjectModel pageObjectModel = indexPage.goToPageObjectModel();
        pageObjectModel.clickRightCarousel();
        Thread.sleep(2000);

    }
    public void checkClickCarouselLeft() throws InterruptedException {
        PageObjectModel pageObjectModel = indexPage.goToPageObjectModel();
        pageObjectModel.clickLeftCarousel();
        Thread.sleep(2000);
    }
}
