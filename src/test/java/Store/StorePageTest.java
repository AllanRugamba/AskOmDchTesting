package Store;

import Base.BaseTest;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StorePageTest extends BaseTest {
    @Test
    public void StorePagetest(){
        HomePage home =new HomePage(driver);
        var storePage = home.clickStorePage();
        var actualResult = storePage.getStorepageHeading();
        var expectedResult = "Store";
        Assert.assertEquals(actualResult,expectedResult,"Store page doesn't load");

    }
}
