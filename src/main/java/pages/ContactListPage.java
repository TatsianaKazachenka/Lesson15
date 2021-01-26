package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContactListPage extends BasePage {
    public ContactListPage(WebDriver driver) {
        super(driver);
    }

    By newBtn = By.cssSelector("[title = New]");
    String locatorContactNameText = "//div[@class = 'slds-tabs_card']//div[@class='slds-tabs_default']//*[contains(text(), '%s')]";

    public void load() {
        openPage(URL_CONTACT_LIST);
    }

    public void clickNewBtn() {
        driver.findElement(newBtn).click();
    }

    public Boolean isTextContactName(String text) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(locatorContactNameText, text))));
            return driver.findElement(By.xpath(String.format(locatorContactNameText, text))).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
