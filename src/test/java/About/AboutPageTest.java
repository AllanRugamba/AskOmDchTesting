package About;

import Base.BaseTest;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AboutPageTest extends BaseTest {
    @Test
    public void aboutPageTest(){
        HomePage homePage = new HomePage(driver);
        var AboutPage =  homePage.clickAboutPage();
        var aboutHeading = AboutPage.getAboutHeading();
        var expectedHeading = "About Us";
        Assert.assertEquals(aboutHeading,expectedHeading, "About doesn't match");
    }
}
