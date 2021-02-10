package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }



    public void openPage() {
        openPage(URL_BASE);
    }

    public void login(String username, String password) {
        openPage();

        driver.findElement(By.id(("username"))).sendKeys(username);
        driver.findElement(By.id(("password"))).sendKeys(password);
        driver.findElement(By.id("Login")).click();
    }
}
