package base;

import com.base.BasePage;
import com.pages.DropDownPage;
import com.pages.IndexPage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

import static com.ultilities.Utility.setUltilityDriver;

public class BaseTest {
    protected WebDriver driver;
    protected BasePage basePage;
    protected IndexPage indexPage;
    protected DropDownPage dropDownPage;
    private String url = "https://webdriveruniversity.com/index.html";

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @BeforeMethod
    public void loadApplication() {
        driver.get(url);
        basePage = new BasePage();
        basePage.setDriver(driver);
        driver.get(url);
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUltilityDriver();
        indexPage = new IndexPage();
        dropDownPage = new DropDownPage();
    }
    @AfterMethod
    public void takeFailedResultScreenshot(ITestResult testResult){
        if (ITestResult.FAILURE== testResult.getStatus()){
            //screenshot in an interface, we must typecast the interface, so driver can take screenshot
          TakesScreenshot takesScreenshot= (TakesScreenshot) driver;
         File source= takesScreenshot.getScreenshotAs(OutputType.FILE);
         File destination = new File(System.getProperty("user.dir") +
                 "/resources/screenshots/(" +
                 java.time.LocalDate.now() + ") " +
                 testResult.getName() + ".png");
                //Get name is a method from the ITest result interface that gets the name
                //of our failed test
            try {
                FileHandler.copy(source,destination);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Screenshot Located At "+destination);
        }
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
