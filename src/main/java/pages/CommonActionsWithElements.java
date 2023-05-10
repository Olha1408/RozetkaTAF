package pages;

import org.aeonbits.owner.ConfigFactory;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import libs.ConfigProperties;


public class CommonActionsWithElements {


    protected WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());
    public static ConfigProperties configProperties = ConfigFactory.create(ConfigProperties.class);



    protected void printErrorAndStopTest(Exception e) {
        logger.error("Cannot work with element " + e);
    }


}