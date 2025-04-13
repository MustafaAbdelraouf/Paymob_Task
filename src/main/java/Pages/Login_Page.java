package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Login_Page extends Base_Page {

    // Locators for login page.

    private By email = By.id("email");
    private By password = By.id("pass");
    private By login = By.id("send2");
    private By signinTab = By.xpath("//a[@href='https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/']");

    // Constructor
    public Login_Page(WebDriver driver) {
        super(driver);
    }

    public void enterEmail(String Email) {

        WebElement emailElement = BasePageDriver.findElement(email);
        emailElement.sendKeys(Email);
    }

    public void enterPassword(String Email) {
        WebElement emailElement = BasePageDriver.findElement(password);
        emailElement.sendKeys(Email);
    }

    public void loginButton() {
        WebElement registerButton = BasePageDriver.findElement(login);
        registerButton.click();
    }

    public void loginButtonTap() {
        WebElement registerButton = BasePageDriver.findElement(signinTab);
        registerButton.click();
    }


}
