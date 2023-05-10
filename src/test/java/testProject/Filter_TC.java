package testProject;
// (TC)Test cases:
//Summary: “Verify if the price filter working
//correctly for the following marketplaces”
//1. Open marketplace url. Verify it.
//2. Open category and subcategory if it is necessary.
//3. Navigate to the filters section, for the following
//marketplaces it is located on the left side. Apply
//2 3 filters.
//4.Verify that all the items on the page are sorted
//correctly by the from and to price filters you
//entered.



import baseTest.BaseTest;
import org.junit.Test;

public class Filter_TC extends BaseTest {




    @Test
    public void TC1_checkingFilter() {

        homePage.openHomePage();
        homePage.goToHeadPhonesCatalog();
        homePage.setFilterByColor();


    }

}
