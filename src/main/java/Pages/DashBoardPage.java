package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoardPage {
    private WebDriver driver;
    private By DashboardMsg = By.xpath("//*[@id=\"post-1235\"]/div/div[2]/div/div[2]");

    public DashBoardPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getDashBoardHeading() {
        return driver.findElement(DashboardMsg).getText().trim();
    }
}
