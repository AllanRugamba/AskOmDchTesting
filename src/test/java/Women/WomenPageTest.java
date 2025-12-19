package Women;

import Base.BaseTest;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomenPageTest extends BaseTest {
    @Test
    public void testWomenPage(){
        HomePage homePage = new HomePage(driver);
        var goToWomen = homePage.clickWomenPage();
        var womenHeading = goToWomen.getWomenPageHeading();
        var expectedResults = "Women";
        Assert.assertEquals(womenHeading, expectedResults, "Women doesn't match");
    }
}
