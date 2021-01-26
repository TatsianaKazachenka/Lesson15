package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    String USERNAME = "tatsiana-um5w@force.com";
    String PASSWORD = "qweasd123";

    public void load() {
        openPage(URL_BASE);
    }

    public void login() {
        load();

        driver.findElement(By.id(("username"))).sendKeys(USERNAME);
        driver.findElement(By.id(("password"))).sendKeys(PASSWORD);
        driver.findElement(By.id("Login")).click();
    }
}
