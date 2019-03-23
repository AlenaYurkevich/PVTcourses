package tests;

import pages.LoginPage;
import pages.ComposeEmailPage;
import pages.DBData;
import pages.TestDataPage;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test3_SendEmailToSeveralAdressees {
	private WebDriver driver;
	private LoginPage loginPage;
	private ComposeEmailPage composeEmailPage;
	private DBData db;
	private TestDataPage testData;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		loginPage = new LoginPage(driver);
		composeEmailPage = new ComposeEmailPage(driver);
		db = new DBData(new TestDataPage()); 
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void sendEmailToSeveralAdressees() {
		db.fillTestDataWithDataFromDB();
		driver.get("https://www.mail.ru/");
		testData = db.getTestData();
		loginPage.enterData(testData.getLogin(), testData.getPassword());
		loginPage.clickEnterButton();
		new WebDriverWait(driver, 15).until(ExpectedConditions.titleContains("Входящие"));
		assertTrue(loginPage.isLogoutPresent(driver));
		composeEmailPage.clickComposeEmailButton();
		composeEmailPage.enterAdressee(testData.getEmail());
		composeEmailPage.enterSubject(testData.getEmailSubject());
		composeEmailPage.enterEmailText(driver, testData.getEmailText());
		composeEmailPage.clickSendEmailButton();
		new WebDriverWait(driver, 10).until(ExpectedConditions.titleContains("Письмо отправлено"));
		assertTrue(composeEmailPage.isEmailSentMessagePresent(driver));

	}

}
