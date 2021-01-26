package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkbox {
    WebDriver driver;
    String locator = "//*[contains(text(),'%s')]/ancestor::div[contains(@class,'uiInputCheckbox')]//input";
    String label;

    public Checkbox(WebDriver driver, String lable) {
        this.driver = driver;
        this.label = lable;
    }

    public void select() {
        driver.findElement(By.xpath(String.format(locator, label))).click();
    }
}
