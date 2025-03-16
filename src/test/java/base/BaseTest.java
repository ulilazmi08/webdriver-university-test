package base;

import com.base.BasePage;
import com.pages.DropDownPage;
import com.pages.IndexPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
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
        driver.get(url);
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUltilityDriver();
        indexPage = new IndexPage();
        dropDownPage = new DropDownPage();
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
