package Account;

import Base.BaseTest;
import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountPageTest extends BaseTest {
    private String username;
    private String email;
    private String password = "Strong@321";

    @Test
    public void testAccountPage(){
        HomePage homePage = new HomePage(driver);
        var AccountPage = homePage.clickAccountPage();
        var AccountHeading = AccountPage.getAccountHeading();
        var expectedResults = "Account";
        Assert.assertEquals(AccountHeading, expectedResults, "Account heading is incorrect.");
    }
    @Test
    public void registerUserWithValidData(){
        HomePage homePage = new HomePage(driver);
        var AccountPage = homePage.clickAccountPage();
        long timestamp = System.currentTimeMillis();
        username = "Gullain" + timestamp;
        email ="rugambelilno" + timestamp + "@gmail.com";
        var registerUserPage = AccountPage.registerWithValidData(username, email, password);
        var actualReasuts = registerUserPage.getDashBoardHeading();
        var expectedResults = "Dashboard\n" +
                "Orders\n" +
                "Downloads\n" +
                "Addresses\n" +
                "Account details\n" +
                "Logout\n" +
                "Hello "+ username + " (not " + username +"? Log out)\n" +
                "From your account dashboard you can view your recent orders, manage your shipping and billing addresses, and edit your password and account details.";
        Assert.assertEquals(actualReasuts, expectedResults, "This email already has an account");
    }

    @Test(dependsOnMethods = "registerUserWithValidData")
    public void loginWithValidData(){
        HomePage homePage = new HomePage(driver);
        var AccountPage = homePage.clickAccountPage();
        var LoginWithData = AccountPage.loginWithValidData(email, password);
        var actualResults = LoginWithData.getDashBoardHeading();
        var expectedResults = "Dashboard\n" +
                "Orders\n" +
                "Downloads\n" +
                "Addresses\n" +
                "Account details\n" +
                "Logout\n" +
                "Hello "+ username + " (not " + username +"? Log out)\n" +
                "From your account dashboard you can view your recent orders, manage your shipping and billing addresses, and edit your password and account details.";
        Assert.assertEquals(actualResults, expectedResults, "This email already has an account");
    }
}
