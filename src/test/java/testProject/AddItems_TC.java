package testProject;
//
//1. Open marketplace url. Verify it.
//        2. Open category and subcategory if it is necessary.
//        3. Add any item to the basket.
//        4. Select another category and add an item from
//        that category.
//        5.Verify information of items inside the basket.
//        6.Verify that the price is calculated correctly.
//        7. Verify that the delete item button is clickable.
//Summary: Add items to the basket”


import baseTest.BaseTest;
import org.junit.Test;

public class AddItems_TC extends BaseTest {

    @Test
    public void addItemToBasket(){

        homePage.openHomePage();
      homePage.verifyURL();
homePage.navigateLeftMenu();
      homePage.goToHeadPhonesCatalog();
   homePage.pickItem();








    }

}
