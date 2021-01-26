package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input {
    WebDriver driver;
    String locator = "//*[contains(text(),'%s')]/ancestor::div[contains(@class,'uiInput')]//input";
    String label;

    public Input(WebDriver driver, String lable) {
        this.driver = driver;
        this.label = lable;
    }

    public void write(String text) {
        System.out.println(String.format("writing text: %s with label: %s", text, label));
        driver.findElement(By.xpath(String.format(locator, label))).sendKeys(text);
    }
}
