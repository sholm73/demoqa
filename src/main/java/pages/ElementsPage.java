package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage extends ParentPage{

    public ElementsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public ElementsPage openElementsPage(){
        try {
            webDriver.get("https://demoqa.com/");
            webDriver.findElement(By.xpath(".//*/h5[text()='Elements']")).click();
            logger.info("Elements page was opened");
        } catch (Exception e){
            logger.error("Can`t work with Elements page");
            Assert.fail("Can`t work with Elements page");
        }
        return this;
    }
}
