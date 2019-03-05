package tests;

import pages.LoginPage;
import pages.ComposeEmailPage;

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

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		loginPage = new LoginPage(driver);
		composeEmailPage = new ComposeEmailPage(driver);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void sendEmailToSeveralAdressees() {
		driver.get("https://www.mail.ru/");
		loginPage.isPasswordFieldPresent(driver);
		loginPage.enterData("alena.n.yurkevich", "Japomenialaparol1");
		loginPage.clickEnterButton();
		new WebDriverWait(driver, 15).until(ExpectedConditions.titleContains("Входящие"));
		assertTrue(loginPage.isLogoutPresent(driver));
		composeEmailPage.clickComposeEmailButton();
		composeEmailPage.enterAdressee("elena.duboenko@gmail.com");
		composeEmailPage.enterAdressee("lenaduboenkotest@gmail.com");
		composeEmailPage.enterSubject("Test");
		composeEmailPage.enterEmailText(driver, "test test");
		composeEmailPage.clickSendEmailButton();
		new WebDriverWait(driver, 10).until(ExpectedConditions.titleContains("Письмо отправлено"));
		assertTrue(composeEmailPage.isEmailSentMessagePresent(driver));

	}

}
