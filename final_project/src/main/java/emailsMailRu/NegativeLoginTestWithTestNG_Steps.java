package emailsMailRu;

import static org.junit.Assert.assertTrue;
import org.apache.log4j.Logger;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;

import org.openqa.selenium.WebDriver;
import org.xml.sax.SAXException;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import emailsMailRu.ParseCredentials;
import driver.WebdriverSingleton;
import emailsMailRu.LoginPage;
import emailsMailRu.WrongMailRuCredentialsModel;
import screenshotMaker.Screenshot;

public class NegativeLoginTestWithTestNG_Steps {
	private static final Logger LOGGER = Logger.getLogger(NegativeLoginTestWithTestNG_Steps.class);
	private WebDriver driver = WebdriverSingleton.getDriver();
	private LoginPage loginPage;


	@When("^I log in with incorrect username and password taken from xml$")
	public void loginWithWrongCreds() throws ParserConfigurationException, SAXException, IOException, XMLStreamException {
		loginPage = new LoginPage(driver);
		List<WrongMailRuCredentialsModel> wrongCreds = ParseCredentials.getInfo();
		driver.get("https://www.mail.ru/");
		loginPage.enterData(wrongCreds.get(0).getUsername(), wrongCreds.get(0).getPassword());
		loginPage.clickEnterButton();
		LOGGER.info("Wrong credentials have been entered");
	}
	
	@When("^I make my screenshot$")
	public void makeScreenshot() throws IOException {
		Screenshot.makeScreenShot(driver);
		LOGGER.info("Screenshot has been taken");
	}
	
	@Then("^I see the error message$")
	public void isErrorMessagePresent() {
		assertTrue(loginPage.isErrorMessagePresent(driver));
		LOGGER.info("Error message is displayed");
		WebdriverSingleton.closeWebBrowser();
	}
}
