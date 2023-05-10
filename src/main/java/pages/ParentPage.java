package pages;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

 abstract public class ParentPage extends CommonActionsWithElements {
    protected String base_url;

    WebDriver webDriver;



     public ParentPage(WebDriver webDriver) {
         this.webDriver = webDriver;
         base_url = configProperties.base_url();

     }

     abstract String getRelativeURL();

       public void verifyURL() {
           Assert.assertEquals("Url is not matched", base_url+getRelativeURL(), webDriver.getCurrentUrl());
           logger.info("checked url");
     }


 }