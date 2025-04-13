package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;

public class Home_Page extends Base_Page {

    private By hotSellersProduct1Size = By.xpath("(//div[contains(@id, 'option-label-size-143-item-')])[3]");
    private By hotSellersProduct2Size = By.xpath("(//div[contains(@id, 'option-label-size-143-item-')])[13]");
    private By addProduct1ToCompare = By.xpath("(//a[@class='action tocompare' and @title='Add to Compare'])[1]");
    private By addProduct2ToCompare = By.xpath("(//a[@class='action tocompare' and @title='Add to Compare'])[3]");
    private By enterToComparisonPage = By.xpath("//a[@href='https://magento.softwaretestingboard.com/catalog/product_compare/']");

    public Home_Page(WebDriver driver) {
        super(driver);
    }

    public void selectProduct1Size() {
        WebElement element = BasePageDriver.findElement(hotSellersProduct1Size);
        element.click();
    }

    public void selectProduct2Size() {
        WebElement element = BasePageDriver.findElement(hotSellersProduct2Size);
        element.click();
    }

    public void selectProduct1ToCompare() {
        WebElement element = BasePageDriver.findElement(addProduct1ToCompare);
        element.click();
    }

    public void selectProduct2ToCompare() {
        WebElement element = BasePageDriver.findElement(addProduct2ToCompare);
        element.click();
    }

    public void enterToComparisonList() {
        WebElement element = BasePageDriver.findElement(enterToComparisonPage);
        element.click();
    }

}
