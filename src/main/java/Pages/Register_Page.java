package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;

import static java.lang.Thread.sleep;

public class Register_Page extends Base_Page {
    // Locators for login page.

    private By firstRegisterButton = By.xpath("//ul[@class='header links']//a[@href='https://magento.softwaretestingboard.com/customer/account/create/']");
    private By firstname = By.id("firstname");
    private By lastname = By.id("lastname");
    private By email = By.id("email_address");
    private By password = By.id("password");
    private By confirmPassword = By.id("password-confirmation");
    private By submitButton = By.xpath("//button[@class='action submit primary']");
    private By signoutIcon = By.xpath("//button[@class='action switch']");
    private By signoutButton = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a");

    // Constructor
    public Register_Page(WebDriver driver) {
        super(driver);
    }


    public void clickForRegister() {
        WebElement registerButton = BasePageDriver.findElement(firstRegisterButton);
        registerButton.click();
    }

    public void enterFirstName(String FirstName) {
        WebElement emailElement = BasePageDriver.findElement(firstname);
        emailElement.sendKeys(FirstName);
    }

    public void enterLastName(String LastName) {
        WebElement emailElement = BasePageDriver.findElement(lastname);
        emailElement.sendKeys(LastName);
    }


    public void enterEmail(String Email) {
        WebElement emailElement = BasePageDriver.findElement(email);
        emailElement.sendKeys(Email);
    }


    public void enterPassword(String Password) {
        WebElement emailElement = BasePageDriver.findElement(password);
        emailElement.sendKeys(Password);
    }


    public void confirmPassword(String ConfirmPassword) {
        WebElement emailElement = BasePageDriver.findElement(confirmPassword);
        emailElement.sendKeys(ConfirmPassword);
    }

    public void submitRegistration() {
        WebElement registerButton = BasePageDriver.findElement(submitButton);
        registerButton.click();
    }

    public void signout() throws InterruptedException {
        WebElement registerButton = BasePageDriver.findElement(signoutIcon);
        registerButton.click();
        sleep(1000);
        BasePageDriver.findElement(signoutButton).click();

    }


}

