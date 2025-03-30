package eviltester;

import com.eviltester.pages.CalculatorPage;
import eviltester.base.BaseTest;
import org.testng.annotations.Test;

public class IndexPageTest extends BaseTest {
    @Test
    public void goToCalculatorPage() throws InterruptedException {
        CalculatorPage calculatorPage = indexPage.clickCalculatorPage();
        Thread.sleep(2000);
    }
}
