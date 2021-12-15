package base;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.HomePage;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeSuite
    public void setUp(){
        String fileDirectory = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",fileDirectory+"/src/main/resources/chromedriver.exe");
        System.setProperty("webdriver.gecko.driver",fileDirectory+"/src/main/resources/geckodriver.exe");
    }

    @BeforeMethod
//    @Parameters("BrowserType")
    public void openBrowser(){
        String browser = System.getProperty("browser");
        if(browser != "" && browser != null) {
            if(browser.equalsIgnoreCase("Chrome")) {
                driver = new ChromeDriver(setChromeOptions());
            }
            else if(browser.equalsIgnoreCase("Firefox")) {
                driver = new FirefoxDriver();
            }
            else{
                driver = new ChromeDriver();
            }
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

        homePage = PageFactory.initElements(driver,HomePage.class);
        }
    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }


    private void closeBrowser(){
        driver.quit();
    }

    @AfterMethod
    public void recordScreenshotandQuit(ITestResult result){
        String fileDirectory = System.getProperty("user.dir");
        if (ITestResult.FAILURE == result.getStatus()){
            var camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File(fileDirectory + "/src/main/resources/" + result.getName() + ".png"));
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
        closeBrowser();
    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }

    private ChromeOptions setChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
//        options.setHeadless(true);
        return options;
    }
}
