package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StorePage {
    private WebDriver driver;
    private By Store = By.xpath("//*[@id=\"main\"]/div/header/h1");


    public StorePage(WebDriver driver) {
        this.driver = driver;
    }
    public String getStorepageHeading(){
        return driver.findElement(Store).getText().trim();
    }

}
