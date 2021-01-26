package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;

    AccountListPage accountListPage;
    NewAccountModal newAccountModal;
    MainPage mainPage;
    ContactListPage contactListPage;
    NewContactModal newContactModal;

    @BeforeMethod
    public void initTest() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        initPages();
    }

    @AfterMethod(alwaysRun = true)
    public void endTest() {
        driver.quit();
    }

    private void initPages() {
        accountListPage = new AccountListPage(driver);
        newAccountModal = new NewAccountModal(driver);
        mainPage = new MainPage(driver);
        contactListPage = new ContactListPage(driver);
        newContactModal = new NewContactModal(driver);
    }
}
