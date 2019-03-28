package tests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import actions.LoginJU;
import driver.WebdriverSingleton;
import pages.LoginPage;
import pages.EmailsListPage;
import pages.DBData;
import pages.TestDataPage;

public class Test1_PutEmailToSpam {
	private WebDriver driver = WebdriverSingleton.getDriver();
	private LoginPage loginPage;
	private EmailsListPage pageWithEmails;
	private DBData db;
	private TestDataPage testData;
	private LoginJU loginJU;

	@Before
	public void setUp() throws Exception {
		loginPage = new LoginPage(driver);
		pageWithEmails = new EmailsListPage(driver);
		db = new DBData(new TestDataPage());
		loginJU = new LoginJU();

	}

	@After
	public void tearDown() throws Exception {
		WebdriverSingleton.closeWebBrowser();
	}

	@Test
	public void putEmailToSpam() {
		loginJU.loginJU(db, driver, testData, loginPage);
		pageWithEmails.checkFirstEmailCheckbox();
		pageWithEmails.clickSpamButton();
		assertTrue(pageWithEmails.isNotificationPresent(driver));
	}
}