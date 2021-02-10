package pages;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountListPage extends BasePage {
    public AccountListPage(WebDriver driver) {
        super(driver);
    }

    By newBtn = By.cssSelector("[title = New]");
    String locatorAccountNameText = "//div[@class = 'slds-tabs_card']//div[@class='slds-tabs_default']//*[contains(text(), '%s')]";

    public void openPage() {
        openPage(URL_ACCOUNT_LIST);
    }

    public void clickNewBtn() {
        driver.findElement(newBtn).click();
    }

    public boolean isAccountNameTextDisplayed(String text) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(locatorAccountNameText, text))));
            return driver.findElement(By.xpath(String.format(locatorAccountNameText, text))).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
