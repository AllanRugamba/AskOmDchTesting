package ContactUs;

import Base.BaseTest;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUsPageTests extends BaseTest {
    @Test
    public void ContactUsPageTest(){
        HomePage homePage = new HomePage(driver);
        var ContactUsPage = homePage.clickContactUsPage();
        var ContactUsHeading = ContactUsPage.getContactUsHeading();
        var expectedResults = "Contact Us";
        Assert.assertEquals(ContactUsHeading, expectedResults, "Contact Us page failed");
    }
}
