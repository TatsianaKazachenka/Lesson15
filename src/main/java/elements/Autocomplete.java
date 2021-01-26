package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Autocomplete {
    //uiAutocomplete
    WebDriver driver;
    String label;
    String locator = "//*[contains(text(),'%s')]/ancestor::div[contains(@class,'uiInput')]//input";
    String selectFirstItem = "//*[contains(@class,'uiAutocomplete')]//ul/li[1]";

    public Autocomplete(WebDriver driver, String lable) {
        this.driver = driver;
        this.label = lable;
    }

    public void write(String text) {
        System.out.println(String.format("writing text: %s with label: %s", text, label));
        driver.findElement(By.xpath(String.format(locator, label))).sendKeys(text);
    }

    public void select(String text) {
        write(text);
        driver.findElement(By.xpath(selectFirstItem)).click();
    }
}
