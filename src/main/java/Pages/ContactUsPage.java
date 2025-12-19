package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage {
    private WebDriver driver;
    private By ContactUs = By.xpath("//*[@id=\"post-60\"]/div/div[1]/div/h1");

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getContactUsHeading(){
        return driver.findElement(ContactUs).getText().trim();
    }
}
