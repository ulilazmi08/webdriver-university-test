package eviltester.base;

import com.base.BasePage;
import com.eviltester.pages.IndexPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static com.ultilities.Utility.setUltilityDriver;

public class BaseTest {
    protected WebDriver driver;
    protected BasePage basePage;
    protected IndexPage indexPage;
    private String url = "https://testpages.eviltester.com/styled/index.html";

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @BeforeMethod
    public void loadApplication(){
        driver.get(url);
        basePage = new BasePage();
        basePage.setDriver(driver);
        driver.get(url);
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUltilityDriver();
        indexPage = new com.eviltester.pages.IndexPage();
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
