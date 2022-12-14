package automation_test;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utilities.DriverFactory;
import utilities.ReadConfigFiles;
import utilities.ScreenCapture;

public class BaseUIClass {
    public WebDriver driver;
    public Logger LOGGER = LogManager.getLogger(this.getClass().getName());
    String testCseName = String.format("---------Test:  %s---------", this.getClass().getName());
    String endTestCse = String.format("-----Test: %s------", this.getClass().getName());

    @BeforeClass
    public void addThread(){
        ThreadContext.put("threadName",this.getClass().getName());
        driver = DriverFactory.getInstance().getDriver();
    }

    @BeforeMethod
    public void openBrowser() {
        String browserUrl= ReadConfigFiles.getPropertyValues("URL");
        ActOn.browser(driver).openBrowser(browserUrl);
        LOGGER.info(testCseName);
        LOGGER.debug("Opening THE URl: " +browserUrl);
        ActOn.browser(driver).openBrowser(browserUrl);
    }

    @AfterMethod
    public void closeBrowser(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            ScreenCapture.getScreenShot(driver);
        }
        driver.quit();
        DriverFactory.getInstance().removeDriver();
        LOGGER.info(endTestCse);
    }
}
