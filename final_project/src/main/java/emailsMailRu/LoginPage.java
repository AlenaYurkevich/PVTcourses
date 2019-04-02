package emailsMailRu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	@FindBy(xpath = ".//input[@id=\"mailbox:password\"] ")
	private WebElement passwordField;

	@FindBy(xpath = ".//input[@id=\"mailbox:login\"] ")
	private WebElement loginField;

	@FindBy(xpath = ".//label[@id=\"mailbox:submit\"] ")
	private WebElement submitButton;

	@FindBy(xpath = ".//a[@id=\"PH_logoutLink\"] ")
	private WebElement logoutLink;

	@FindBy(xpath = ".//div[@class=\"mailbox__row mailbox__row_condensed i-font-md i-color-coral\"]")
	private WebElement errorMessage;

	@FindBy(xpath = ".//a[@id=\"PH_authLink\"]")
	private WebElement loginLink;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterData(String login, String password) {
		enterText(loginField, login);
		enterText(passwordField, password);
	}

	private void enterText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	public void clickEnterButton() {
		submitButton.click();
	}

	public boolean isLogoutPresent(WebDriver driver) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(logoutLink));
		return logoutLink.isDisplayed();
	}

	public boolean isPasswordFieldPresent(WebDriver driver) {
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(passwordField));
		return logoutLink.isDisplayed();
	}

	public boolean isErrorMessagePresent(WebDriver driver) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(errorMessage));
		return errorMessage.isDisplayed();
	}

	public void clickLogout() {
		logoutLink.click();
	}

	public boolean isLoginPresent(WebDriver driver) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(loginLink));
		return loginLink.isDisplayed();

	}
}
