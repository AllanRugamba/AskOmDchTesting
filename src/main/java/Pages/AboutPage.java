package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutPage {
    private WebDriver driver;
    private By About = By.xpath("//*[@id=\"post-59\"]/div/div[1]/div/h1");

    public AboutPage(WebDriver driver){
        this.driver = driver;
    }

    public String getAboutHeading(){
        return driver.findElement(About).getText().trim();
    }
}
