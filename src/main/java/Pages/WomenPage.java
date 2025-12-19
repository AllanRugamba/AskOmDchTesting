package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WomenPage {
    private WebDriver driver;
    private By Women = By.xpath("//*[@id=\"main\"]/div/header/h1");
    public WomenPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getWomenPageHeading(){
        return driver.findElement(Women).getText().trim();
    }
}
