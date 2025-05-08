package eviltester;

import com.eviltester.pages.DragAndDropPage;
import eviltester.base.BaseTest;
import org.testng.annotations.Test;

public class DragAndDropItemTest extends BaseTest {
    @Test
    private void dragItem1ToDrop1() throws InterruptedException {
        DragAndDropPage dragAndDropPage = indexPage.clickDragAndDropTestPage();
        Thread.sleep(2000);
        dragAndDropPage.dragItem1();
        Thread.sleep(2000);
    }
}
