package Common_Use;

import Pages.Login_Page;
import Pages.Register_Page;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


public class baseTest {


//Global Variable

    public static WebDriver baseTestDriver;

    @BeforeSuite(description = "test2@test.com for email and User@123 for password")
    public void Setup() throws InterruptedException {


        // ADD NEW CONFIG FILE LOCATION
        Config configLoader = new Config(new File("./src/main/resources/Config.properties"));
        String[] url = configLoader.Insert_Data("url");
        String website = url[0];
        WebDriverManager.chromedriver().setup();
        Thread.sleep(100);
        baseTestDriver = new ChromeDriver();
        baseTestDriver.manage().window().maximize();
        baseTestDriver.get(website);
        baseTestDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
    }
    //For sending parameters patch file ()-------------------------


    @AfterMethod(description = "Take pic for failed testcases")
    public void failedTestCaseScreen(ITestResult TestCaseResult) throws IOException {
        if (TestCaseResult.getStatus() == ITestResult.FAILURE) {
            //Take screenshot and add it to a folder and name it with the testcase name
            File SCREENSHOT = ScreenShots.takeshots(baseTestDriver, "C:\\Users\\mustafa.abdelraouf\\IdeaProjects\\AppyInnovate\\ScreenShots\\" + TestCaseResult.getName() + ".png");
            System.out.println("ITestResult.Failure is" + ITestResult.FAILURE);
            System.out.println("TestCaseResult.getStatus()" + TestCaseResult.getStatus());
            ScreenShots.takeshots(baseTestDriver, TestCaseResult.getName());
            //Add the failed test case screenshot in the testing report
            Allure.addAttachment(" Page Screenshot", FileUtils.openInputStream(SCREENSHOT));
        }
    }


    @AfterSuite
    public void quit() throws InterruptedException {
        Thread.sleep(3000);
        baseTestDriver.quit();
    }
}
