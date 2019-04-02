package emailsMailRu;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import driver.WebdriverSingleton;
import emailsMailRu.ComposeEmailPage;
import emailsMailRu.DBData;
import emailsMailRu.LoginPage;
import emailsMailRu.TestDataPage;

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
		composeEmail.isEmailSent(composeEmailPage, driver);
		WebdriverSingleton.closeWebBrowser();
	}

}
