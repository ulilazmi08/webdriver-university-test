package eviltester.base;

import com.eviltester.pages.CalculatorPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorPageTest extends BaseTest{
    @Test
    public void testTimesFunction() throws InterruptedException {
        CalculatorPage calculatorPage = indexPage.clickCalculatorPage();
        calculatorPage.setInputNumber1();
        calculatorPage.setInputNumber2();
        calculatorPage.selectFunctionDropDown("times");
        calculatorPage.clickCalculateButton();
        Thread.sleep(2000);
        Assert.assertTrue(calculatorPage.isCalculateResultCorrect("6"),"Benar");
    }
    @Test
    public void testPlusFunction() throws InterruptedException {
        CalculatorPage calculatorPage = indexPage.clickCalculatorPage();
        calculatorPage.setInputNumber1();
        calculatorPage.setInputNumber2();
        calculatorPage.selectFunctionDropDown("plus");
        calculatorPage.clickCalculateButton();
        Thread.sleep(2000);
        Assert.assertTrue(calculatorPage.isCalculateResultCorrect("5"),"Benar");
    }

}
