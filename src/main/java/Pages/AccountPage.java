package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {
    private WebDriver driver;
    private By Account =  By.xpath("//*[@id=\"post-1235\"]/div/div[1]/div/h1");
    private By username = By.id("username");
    private By password = By.id("password");
    private By newUsername = By.id("reg_username");
    private By newPassword = By.id("reg_password");
    private By newEmail = By.id("reg_email");
    private By registrationBtn = By.name("register");
    private By rememberMe = By.id("rememberme");
    private By LoginBtn = By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/button");

    public AccountPage(WebDriver driver){
        this.driver = driver;
    }
    public String getAccountHeading(){
        return driver.findElement(Account).getText().trim();
    }
    public DashBoardPage registerWithValidData(String Username, String email, String Password){
        driver.findElement(newUsername).clear();
        driver.findElement(newUsername).sendKeys(Username);
        driver.findElement(newEmail).clear();
        driver.findElement(newEmail).sendKeys(email);
        driver.findElement(newPassword).clear();
        driver.findElement(newPassword).sendKeys(Password);
        driver.findElement(registrationBtn).click();
        return new DashBoardPage(driver);
    }
    public DashBoardPage loginWithValidData(String Username, String Password){
        driver.findElement(username).clear();
        driver.findElement(username).sendKeys(Username);
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys(Password);
        driver.findElement(LoginBtn).click();
        return new DashBoardPage(driver);
    }
}
