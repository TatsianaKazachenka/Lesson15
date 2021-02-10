package elements;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Autocomplete {
    WebDriver driver;
    String label;
    String locator = "//*[contains(text(),'%s')]/ancestor::div[contains(@class,'uiInput')]//input";
    String selectFirstItem = "//*[contains(@class,'uiAutocomplete')]//ul/li[1]";

    public Autocomplete(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        System.out.println(String.format("writing text: %s with label: %s", text, label));
        driver.findElement(By.xpath(String.format(locator, label))).sendKeys(text);
    }

    public void select(String text) {
        write(text);
        waitForOpened();
        driver.findElement(By.xpath(selectFirstItem)).click();
    }

    public void waitForOpened() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selectFirstItem)));
        } catch (TimeoutException exception) {
            Assert.fail(String.format("There are no items in the list %s to select!", label));
        }
    }
}
