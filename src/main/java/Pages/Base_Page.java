package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static java.lang.invoke.MethodHandles.lookup;

public class Base_Page {

    public static final Logger log = LogManager.getLogger(lookup().lookupClass());
    protected static WebDriver BasePageDriver;


    WebDriverWait wait = new WebDriverWait(BasePageDriver, Duration.ofSeconds(10));

    public Base_Page(WebDriver driver) {
        BasePageDriver = driver;
    }

    private final By Page_headline = By.xpath("//span[@class='base']");


    public void Assertion_page_Title_Name(String Page_Name) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Page_headline));
        String title = BasePageDriver.findElement(Page_headline).getText();
        Assert.assertEquals(title, Page_Name);
        log.info("you are in the {} Page and this is correct", Page_Name);
        System.out.println("you are in the " + Page_Name + " Page and this is correct");
    }

}
