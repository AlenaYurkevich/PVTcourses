package actions;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import driver.WebdriverSingleton;
import pages.ComposeEmailPage;
import pages.DBData;
import pages.LoginPage;
import pages.TestDataPage;

public class Facade {
	private LoginJU loginJU;
	private ComposeEmail composeEmail;
	private LoginPage loginPage;
	private ComposeEmailPage composeEmailPage;
	private DBData db;
	private TestDataPage testData;
	private WebDriver driver = WebdriverSingleton.getDriver();
	
	public Facade() {
		this.loginJU = new LoginJU();
		this.composeEmail = new ComposeEmail();
		loginPage = new LoginPage(driver);
		composeEmailPage = new ComposeEmailPage(driver);
		testData = new TestDataPage();
		db = new DBData(testData);
		loginJU = new LoginJU();
		composeEmail = new ComposeEmail();
	}
	
	@Test
	public void sendEmail() {
		testData = loginJU.loginJU(db, driver, testData, loginPage);
		composeEmail.composeEmail(composeEmailPage, testData, driver);
		WebdriverSingleton.closeWebBrowser();
	}

}
