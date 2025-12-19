package Accessories;

import Base.BaseTest;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccessoriesPageTests extends BaseTest {
    @Test
    public void AccessoriesPageTest(){
        HomePage homePage = new HomePage(driver);
        var AccessoriesPage = homePage.clickAccessoriesPage();
        var AccessoriesHeading = AccessoriesPage.getAccessoriesHead();
        var expectedResults = "Accessories";
        Assert.assertEquals(AccessoriesHeading, expectedResults, "Accessories heading is incorrect.");
    }
}
