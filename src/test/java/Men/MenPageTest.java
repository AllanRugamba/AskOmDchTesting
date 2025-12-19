package Men;

import Base.BaseTest;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenPageTest extends BaseTest {
    @Test
    public void MenPageTest() {
        HomePage homePage = new HomePage(driver);
        var clickThePage = homePage.clickMenPage();
        var onThePage = clickThePage.getMenPageHeading();
        var expectedResults = "Men";
        Assert.assertEquals(onThePage, expectedResults,"Men page doesn't load");
    }
}
