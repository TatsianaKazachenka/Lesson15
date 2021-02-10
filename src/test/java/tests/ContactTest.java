package tests;

import objects.Contact;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactTest extends BaseTest {
    Contact contact = new Contact("Dr.", "Test First Name", "Test Last Name",
            "+375252222222", "+375251111111", "Test Account Name", "Test Title", "Test@test.by",
            "Test Reports To", "Test Mailing Street", "Test Mailing City",
            "Test Mailing Zip", "Test Mailing State", "Test Mailing Country",
            "Test Other Street", "Test Other City", "Test Other Zip",
            "Test Other State", "Test Other Country", "+375253333333", "www.test.by",
            "80171234567", "80178745612", "80178521452",
            "Test Assistant", "Test Department", "Other", "Test Description");

    @Test
    public void createContactTest() {
        mainPage.login(USERNAME, PASSWORD);
        contactListPage.openPage();
        contactListPage.clickNewBtn();

        newContactModal.create(contact);
        newContactModal.clickSaveBtn();

        Assert.assertTrue(contactListPage.isContactNameTextDisplayed("Test First Name"));
    }
}
