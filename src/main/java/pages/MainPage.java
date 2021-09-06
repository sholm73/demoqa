package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends ParentPage{

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public MainPage OpenFormsPage() {
        try {
            webDriver.get("https://demoqa.com/");
            webDriver.findElement(By.xpath(".//*/h5[text()='Elements']")).click();
            logger.info("Elements Page was opened");
        } catch (Exception e){

        }
        return new MainPage(webDriver);
    }
}
