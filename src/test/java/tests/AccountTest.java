package tests;

import objects.Account;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountTest extends BaseTest {
    Account account = new Account("Test Account Name", "Test Parent Account", "+375251111111",
            "+375252222222", "www.test.by", "Competitor", "Communications", "1",
            "2", "Test Additional Information Description", "Test Billing Street",
            "Test Shipping Street", "Test Billing City", "Test Billing State",
            "TestBilling Zip", "Test Billing Country", "Test Shipping City",
            "Test Shipping State", "Test Shipping Zip", "Test Shipping Country");

    @Test
    public void createContactTest() {
        mainPage.login(USERNAME, PASSWORD);
        accountListPage.openPage();
        accountListPage.clickNewBtn();

        newAccountModal.create(account);
        newAccountModal.clickSaveBtn();

        Assert.assertTrue(accountListPage.isAccountNameTextDisplayed("Test Account Name"));
    }
}
