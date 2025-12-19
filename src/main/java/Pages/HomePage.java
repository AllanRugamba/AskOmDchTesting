package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By storeLink = By.linkText("Store");
    private By MenLink = By.linkText("Men");
    private By WomenLink = By.linkText("Women");
    private By AccessoriesLink = By.linkText("Accessories");
    private By AccountLink = By.linkText("Account");
    private By AboutLink = By.linkText("About");
    private By ContactUsLink = By.linkText("Contact Us");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public StorePage clickStorePage(){
        driver.findElement(storeLink).click();
        return new StorePage(driver);
    }
    public MenPage clickMenPage(){
        driver.findElement(MenLink).click();
        return new MenPage(driver);
    }
    public WomenPage clickWomenPage(){
        driver.findElement(WomenLink).click();
        return new WomenPage(driver);
    }
    public AccessoriesPage clickAccessoriesPage(){
        driver.findElement(AccessoriesLink).click();
        return new AccessoriesPage(driver);
    }
    public AccountPage clickAccountPage(){
        driver.findElement(AccountLink).click();
        return new AccountPage(driver);
    }
    public AboutPage clickAboutPage(){
        driver.findElement(AboutLink).click();
        return new AboutPage(driver);
    }
    public ContactUsPage clickContactUsPage(){
        driver.findElement(ContactUsLink).click();
        return new ContactUsPage(driver);
    }
}
