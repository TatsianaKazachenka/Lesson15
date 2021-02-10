package pages;

import elements.*;
import objects.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewContactModal extends BasePage {
    public NewContactModal(WebDriver driver) {
        super(driver);
    }

    String saveBtn = "//*[@class='inlineFooter']//button[@title='Save']";

    public void create(Contact contact) {
        new DropDown(driver, "Salutation").select(contact.getSalutation());
        new Input(driver, "First Name").write(contact.getFirstName());
        new Input(driver, "Last Name").write(contact.getLastName());
        new Autocomplete(driver, "Account Name").select(contact.getAccName());

        new Input(driver, "Title").write(contact.getTitle());
        new Input(driver, "Phone").write(contact.getPhone());
        new Input(driver, "Mobile").write(contact.getMobile());
        new Input(driver, "Email").write(contact.getEmail());
        new Input(driver, "Reports To").write(contact.getReportsTo());

        new TextArea(driver, "Mailing Street").write(contact.getMailingStreet());
        new TextArea(driver, "Other Street").write(contact.getOtherStreet());
        new Input(driver, "Mailing City").write(contact.getMailingCity());
        new Input(driver, "Mailing Zip").write(contact.getMailingZip());
        new Input(driver, "Other City").write(contact.getOtherCity());
        new Input(driver, "Other Zip").write(contact.getOtherZip());
        new Input(driver, "Other State").write(contact.getOtherState());
        new Input(driver, "Other Country").write(contact.getOtherCountry());

        new Input(driver, "Fax").write(contact.getFax());
        new Input(driver, "Home Phone").write(contact.getHomePhone());
        new Input(driver, "Other Phone").write(contact.getOtherPhone());
        new Input(driver, "Asst. Phone").write(contact.getAsstPhone());
        new Input(driver, "Assistant").write(contact.getAssistant());
        new Input(driver, "Department").write(contact.getDepartment());
        new DropDown(driver, "Lead Source").select(contact.getLeadSource());
        new Datepicker(driver, "Birthdate").selectToday();

        new TextArea(driver, "Description").write(contact.getDescription());
    }

    public void clickSaveBtn() {
        driver.findElement(By.xpath(saveBtn)).click();
    }
}
