package baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.HomePage;

import java.time.Duration;

public class BaseTest {

    protected WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());

    protected HomePage homePage;

    @Before
    public void setUp() {


        webDriver = initDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        homePage = new HomePage(webDriver);


    }

    @After
    public void quitBrowser() {
        webDriver.quit();
        logger.info("was closed browser");
    }


    private WebDriver initDriver() {

        String browser = System.getProperty("browser");
        if ((browser == null) || "chrome".equalsIgnoreCase(browser)) {


            ChromeOptions ops = new ChromeOptions();
            ops.addArguments("--remote-allow-origins=*");
            WebDriverManager.chromedriver().setup();
            webDriver = new ChromeDriver(ops);

        }
        return webDriver;
    }
}
