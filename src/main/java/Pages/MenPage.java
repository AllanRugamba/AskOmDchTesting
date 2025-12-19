package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenPage {
    private WebDriver driver;
    private By Men = By.linkText("Men");

    public MenPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getMenPageHeading() {
        return driver.findElement(Men).getText().trim();
    }
}
