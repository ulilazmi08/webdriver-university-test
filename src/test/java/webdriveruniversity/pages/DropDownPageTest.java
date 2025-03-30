package webdriveruniversity.pages;
import webdriveruniversity.pages.base.BaseTest;
import com.webdriveruniversity.pages.DropDownPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownPageTest extends BaseTest{
    @Test
    public void clickPythonLanguageDropDown() throws InterruptedException {
        DropDownPage dropDownPage = indexPage.goToDropDownPage();
        Thread.sleep(2000);
        dropDownPage.selectProgrammingLanguageDropDown("Python");
        Thread.sleep(2000);
    }
@Test
    public void clickMavenDropDown() throws InterruptedException {
        DropDownPage dropDownPage = indexPage.goToDropDownPage();
        Thread.sleep(2000);
        dropDownPage.selectEclipseDropDown("Maven");
        Thread.sleep(1000);
    }
    @Test
    public void clickLanguageProgrammingDropDown() throws InterruptedException {
        DropDownPage dropDownPage = indexPage.goToDropDownPage();
        Thread.sleep(2000);
        dropDownPage.selectLanguageDropDrown("JavaScript");
        Thread.sleep(2000);
    }
    @Test
    public void clickBlueRadioButton() throws InterruptedException {
        DropDownPage dropDownPage = indexPage.goToDropDownPage();
        Thread.sleep(3000);
        dropDownPage.clickBlueRadioButton();
        Thread.sleep(3000);
    }
    @Test void clickOption3Checbox() throws InterruptedException {
        DropDownPage dropDownPage1 = indexPage.goToDropDownPage();
        Thread.sleep(3000);
        dropDownPage1.clickOption3Checkbox();
        Thread.sleep(2000);
    }
    @Test
    public void isCabbageButtonIsEnabled() throws InterruptedException {
        DropDownPage dropDownPage1 = indexPage.goToDropDownPage();
        Thread.sleep(3000);
        boolean checkCabbageButton = dropDownPage1.isCabbageButtonDisabled();
        Assert.assertFalse(checkCabbageButton,"\ncabbageButton Is Disabled\n");
    }
}
