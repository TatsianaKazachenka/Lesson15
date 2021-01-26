package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Datepicker {
    WebDriver driver;
    String label;
    String locator = "//*[contains(text(),'%s')]/ancestor::div[contains(@class,'uiInputDate')]//input";
    String selectToday = "//*[contains(@class, 'uiDatePicker')]/descendant::button";

    public Datepicker(WebDriver driver, String lable) {
        this.driver = driver;
        this.label = lable;
    }

    public void selectToday() {
        driver.findElement(By.xpath(String.format(locator, label))).click();
        driver.findElement(By.xpath(selectToday)).click();
    }
}
