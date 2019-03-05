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
import pages.PageWithEmails;

public class Test4and5_MarkWithFlagsAndRemoveThem {
	private WebDriver driver;
	private LoginPage loginPage;
	private PageWithEmails pageWithEmails;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		loginPage = new LoginPage(driver);
		pageWithEmails = new PageWithEmails(driver);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void removeFlags() throws InterruptedException {
		driver.get("https://www.mail.ru/");
		loginPage.enterData("alena.n.yurkevich", "Japomenialaparol1");
		loginPage.clickEnterButton();
		new WebDriverWait(driver, 10).until(ExpectedConditions.titleContains("Входящие"));
		assertTrue(loginPage.isLogoutPresent(driver));

		for (int i = 1; i <= 3; i++) {
			pageWithEmails.markFlags(driver, i);
		}
		for (int i = 1; i <= 3; i++) {
			assertTrue(pageWithEmails.isRemoveFlagHoverDisplayed(driver, i));
		}

		pageWithEmails.selectFlagged(driver);
		pageWithEmails.removeFlags(driver);

		for (int i = 1; i <= 3; i++) {
			assertTrue(pageWithEmails.isNoFlagHoverDisplayed(driver, i));
		}
	}
}
