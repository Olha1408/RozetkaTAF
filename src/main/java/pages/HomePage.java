package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends ParentPage {


    @FindBy(xpath = ".//*[@class='button button--navy button--small catalog-settings__filter-button ng-star-inserted'] ")
    private WebElement filterLeftMenu;


    @FindBy(xpath = ".//*/a[contains(text(),'Рожевий')]")
    private WebElement setColorPink;


    @FindBy(xpath = ".//*[@class='button button--medium button--with-icon menu__toggle ng-star-inserted'] ")
    private WebElement clickCatalogButton;

    @FindBy(xpath = ".//*[@class='menu-categories__link js-menu-categories__link menu-categories__link_state_hovered'] ")
    private WebElement clickCategoryPhones;


    @FindBy(css = "a.goods-tile__picture.ng-star-inserted[title='Навушники Defunc True Music TWS Black (D4271M)']")
    private WebElement headphonesLink;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    String getRelativeURL() {
        return "/";
    }

    Logger logger = Logger.getLogger(getClass());

    public void openHomePage() {

        try {
            webDriver.get(base_url);
            //  webDriver.get("https://rozetka.com.ua/ua/");
            logger.info("rozetka was opened");

        } catch (Exception e) {
            logger.error("Cannot open page " + e);
        }
    }

    public void setFilterByColor() {
        try {
            WebElement setColorPink = webDriver.findElement(By.xpath(".//*/a[contains(text(),'Рожевий')]"));
            setColorPink.click();
            logger.info("button was clicked ");

        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    public void navigateLeftMenu() {

        try {
            WebElement clickCategoryPhones = webDriver.findElement(By.xpath(".//*[@class='menu-categories__link js-menu-categories__link menu-categories__link_state_hovered']"));

        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
        logger.info("go to Phones category");
    }

    public void goToHeadPhonesCatalog() {
        try {
            WebElement clickCatalogButton = webDriver.findElement(By.xpath(".//*[@class='button button--medium button--with-icon menu__toggle ng-star-inserted']"));
            clickCatalogButton.click();

        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
        logger.info("go to subCategory");
    }


    public void pickItem() {
        WebElement headphonesLink = webDriver.findElement(By.cssSelector("a.goods-tile__picture.ng-star-inserted[title='Навушники Defunc True Music TWS Black (D4271M)']"));

        try {
            WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.alertIsPresent());
            webDriver.switchTo().alert().accept();
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }

        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(headphonesLink));

        headphonesLink.click();


        logger.info("choose item with  id'296932928']");
    }


}
