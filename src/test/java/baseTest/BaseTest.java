package baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ElementsPage;
import pages.FormsPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver webDriver;
    protected ElementsPage elementsPage;
    protected FormsPage formsPage;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        elementsPage = new ElementsPage(webDriver);
        formsPage = new FormsPage(webDriver);
    }

    @After
    public void tearDown(){
        webDriver.quit();
    }
}