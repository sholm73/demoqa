package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormsPage extends ParentPage {

    public FormsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public FormsPage openFormsPage() {
        try {
            webDriver.get(baseURL);
            webDriver.findElement(By.xpath(".//*/h5[text()='Forms']")).click();
            logger.info("Forms Page was opened");
        } catch (Exception e) {
            logger.error("Can`t work with Forms Page");
            Assert.fail("Can`t work with Forms Page");
        }
        return this;
    }
}
