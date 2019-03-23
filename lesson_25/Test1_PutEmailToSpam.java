package tests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.LoginPage;
import pages.EmailsListPage;
import pages.DBData;
import pages.TestDataPage;


public class Test1_PutEmailToSpam {
	private WebDriver driver;
	private LoginPage loginPage;
	private EmailsListPage pageWithEmails;
	private DBData db;
	private TestDataPage testData;
	

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		loginPage = new LoginPage(driver);
		pageWithEmails = new EmailsListPage(driver);
		db = new DBData(new TestDataPage());
		
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void putEmailToSpam() {
		db.fillTestDataWithDataFromDB();
		driver.get("https://www.mail.ru/");
		testData = db.getTestData();
		loginPage.enterData(testData.getLogin(), testData.getPassword());
		loginPage.clickEnterButton();
		new WebDriverWait(driver, 10).until(ExpectedConditions.titleContains("Входящие"));
		assertTrue(loginPage.isLogoutPresent(driver));
		pageWithEmails.checkFirstEmailCheckbox();
		pageWithEmails.clickSpamButton();
		assertTrue(pageWithEmails.isNotificationPresent(driver));
	}
}