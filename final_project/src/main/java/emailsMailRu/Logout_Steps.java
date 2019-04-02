package emailsMailRu;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import emailsMailRu.LoginJU;
import driver.WebdriverSingleton;
import emailsMailRu.DBData;
import emailsMailRu.LoginPage;
import emailsMailRu.TestDataPage;
import screenshotMaker.Screenshot;

public class Logout_Steps {
	private static final Logger LOGGER = Logger.getLogger(Logout_Steps.class);
	
	private WebDriver driver = WebdriverSingleton.getDriver();
	private LoginPage loginPage;
	private DBData db;
	private TestDataPage testData;
	private LoginJU loginJU;

	@When("^I log in my account$")
	public void login() {
		loginPage = new LoginPage(driver);
		db = new DBData(new TestDataPage());
		loginJU = new LoginJU();
		loginJU.loginJU(db, driver, testData, loginPage);
		LOGGER.info("We have successfully logged in");
	}
	
	@When("^I click Logout link$")
	public void clickLogout() {
		loginPage.clickLogout();
	}
	
	@When("^I make a screenshot$")
	public void makeScreenshot() throws IOException {
		Screenshot.makeScreenShot(driver);
		LOGGER.info("Screenshot has been taken");
	}
	
	@Then("^I am logged out$")
	public void isLoggedOut() {
		assertTrue(loginPage.isLoginPresent(driver));
		LOGGER.info("We have successfully logged out");
		WebdriverSingleton.closeWebBrowser();	
	}
}