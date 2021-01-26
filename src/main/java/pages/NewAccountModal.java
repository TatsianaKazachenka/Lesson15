package pages;

import elements.Checkbox;
import elements.DropDown;
import elements.Input;
import elements.TextArea;
import objects.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountModal extends BasePage {
    public NewAccountModal(WebDriver driver) {
        super(driver);
    }

    String saveBtn = "//*[@class='inlineFooter']//button[@title='Save']";

    public void create(Account account) {
        new Input(driver, "Account Name").write(account.getAccName());
        new Input(driver, "Parent Account").write(account.getAccParent());
        new Input(driver, "Phone").write(account.getPhone());
        new Input(driver, "Fax").write(account.getFax());
        new Input(driver, "Website").write(account.getWebsite());

        new DropDown(driver, "Type").select(account.getType());
        new DropDown(driver, "Industry").select(account.getIndustry());
        new Input(driver, "Employees").write(account.getEmployees());
        new Input(driver, "Annual Revenue").write(account.getAnnualRevenue());
        new TextArea(driver, "Description").write(account.getDescription());

        new TextArea(driver, "Billing Street").write(account.getBillingStreet());
        new Input(driver, "Billing City").write(account.getBillingCity());
        new Input(driver, "Billing State").write(account.getBillingState());
        new Input(driver, "Billing Zip").write(account.getBillingZip());
        new Input(driver, "Billing Country").write(account.getBillingCountry());

        new TextArea(driver, "Shipping Street").write(account.getShippingStreet());
        new Input(driver, "Shipping City").write(account.getShippingCity());
        new Input(driver, "Shipping State").write(account.getShippingState());
        new Input(driver, "Shipping Zip").write(account.getShippingZip());
        new Input(driver, "Shipping Country").write(account.getShippingCountry());

        new Checkbox(driver, "Copy Billing Address to Shipping Address").select();
    }

    public void clickSaveBtn() {
        driver.findElement(By.xpath(saveBtn)).click();
    }
}
