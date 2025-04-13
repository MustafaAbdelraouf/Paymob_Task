package Magento;

import Common_Use.Config;
import Common_Use.baseTest;
import Pages.Home_Page;
import Pages.Login_Page;
import Pages.Register_Page;
import jdk.jfr.Description;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;

import static java.lang.Thread.sleep;

public class Magento_Test extends baseTest {
    Register_Page reg;
    Login_Page login;
    Home_Page hp;

    Config configLoader = new Config(new File("./src/main/resources/Config.properties"));
    String[] RegisterFirstName = configLoader.Insert_Data("RegisterFirstName");
    String[] RegisterLastName = configLoader.Insert_Data("RegisterLastName");
    String[] RegisterEmail = configLoader.Insert_Data("RegisterEmail");
    String[] RegisterPassword = configLoader.Insert_Data("RegisterPassword");

    private void scrollBy(int dimensions) {
        JavascriptExecutor js = (JavascriptExecutor) baseTestDriver;
        js.executeScript("window.scrollBy(0," + dimensions + ")");
    }

    @Description("This method for add new user by creating the new account for register")
    @Test
    public void registerForNewAccount() throws InterruptedException {
        reg = new Register_Page(baseTestDriver);
        reg.clickForRegister();
        sleep(1000);
        reg.enterFirstName(RegisterFirstName[3]);
        sleep(1000);
        reg.enterLastName(RegisterLastName[1]);
        sleep(1000);
        reg.enterEmail(RegisterEmail[3]);
        sleep(1000);
        reg.enterPassword(RegisterPassword[0]);
        sleep(1000);
        reg.confirmPassword(RegisterPassword[0]);
        sleep(1000);
        reg.submitRegistration();
        sleep(1000);
        reg.signout();
        sleep(1000);


    }

    @Description("This method for Login for already registered user")
    @Test
    public void signIn() throws InterruptedException {
        login = new Login_Page(baseTestDriver);
        login.loginButtonTap();
        sleep(500);
        login.enterEmail(RegisterEmail[0]);
        sleep(500);
        login.enterPassword(RegisterPassword[0]);
        sleep(500);
        login.loginButton();
        JavascriptExecutor js = (JavascriptExecutor) baseTestDriver;
        sleep(2000);
        scrollBy(1500);
        sleep(2000);
    }

    @Description("This method make user select the products and compare with the selected products at comparison list")
    @Test(dependsOnMethods = "signIn")
    public void productComparison() throws InterruptedException {
        hp = new Home_Page(baseTestDriver);
        hp.selectProduct1Size();
        sleep(500);
        hp.selectProduct1ToCompare();
        sleep(500);
        JavascriptExecutor js = (JavascriptExecutor) baseTestDriver;
        sleep(3000);
        scrollBy(1400);
        sleep(2000);
        scrollBy(1400);
        hp.selectProduct2Size();
        sleep(500);
        hp.selectProduct2ToCompare();
        sleep(500);
        hp.enterToComparisonList();
        scrollBy(300);


    }
}
