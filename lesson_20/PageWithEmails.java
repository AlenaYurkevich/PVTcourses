package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageWithEmails {
	@FindBy(xpath = "(.//div[@class=\"js-checkbox b-checkbox\"])[1]")
	private WebElement firstEmailCheckbox;

	@FindBy(xpath = "(.//div[@data-name=\"spam\"])[1]")
	private WebElement spamButton;

	@FindBy(xpath = "//.//span[@class=\"js-txt _js-title notify-message__title__text notify-message__title__text_ok\"]")
	private WebElement notification;

	@FindBy(xpath = ".//a[@href=\"/messages/spam/\"]")
	private WebElement spamLink;

	@FindBy(xpath = "(.//div[@class=\"js-checkbox b-checkbox\"])[13]")
	private WebElement firstSpamEmailCheckbox;

	@FindBy(xpath = "(.//div[@data-name=\"noSpam\"])[1]")
	private WebElement notSpamButton;

	@FindBy(xpath = "(.//div[@data-title=\"Снять флажок\"])[1]")
	private WebElement removeFirstFlagHover;

	@FindBy(xpath = "(.//div[@data-title=\"Пометить флажком\"])[1]")
	private WebElement noFlagHover;

	@FindBy(xpath = "(.//div[@class=\"b-toolbar__item b-toolbar__item_selectAll\"])[1]")
	private WebElement selectAllDropdown;

	@FindBy(xpath = "(.//a[@class=\"b-dropdown__list__item\"])[13]")
	private WebElement flaggedOption;

	@FindBy(xpath = "(.//div[@class=\"b-dropdown b-dropdown_more b-dropdown_adaptive b-dropdown_right b-dropdown_false b-dropdown_grouped b-dropdown_grouped_last\"])[1]")
	private WebElement moreDropdown;

	@FindBy(xpath = "(.//div[@class=\"b-dropdown__list\"])[6]")
	private WebElement moreBlock;

	@FindBy(xpath = ".//a[@data-name=\"flag_no\"]")
	private WebElement removeFlagsOption;

	public PageWithEmails(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void checkFirstEmailCheckbox() {
		firstEmailCheckbox.click();
	}

	public void clickSpamButton() {
		spamButton.click();
	}

	public boolean isNotificationPresent(WebDriver driver) {
		new WebDriverWait(driver, 4).until(ExpectedConditions.visibilityOf(notification));
		return notification.isDisplayed();
	}

	public void clickSpamLink() {
		spamLink.click();
	}

	public boolean isNotSpamButtonPresent(WebDriver driver) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(notSpamButton));
		return notSpamButton.isDisplayed();
	}

	public void checkFirstSpamEmailCheckbox() {
		firstSpamEmailCheckbox.click();
	}

	public void clickNotSpamButton() {
		notSpamButton.click();
	}

	public void markFlags(WebDriver driver, int i) {
		(driver.findElement(By.xpath("(.//div[@class=\"b-datalist__item__flag\"])[" + i + "]"))).click();
	}

	public boolean isRemoveFlagHoverDisplayed(WebDriver driver, int i) {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("(.//div[@class=\"b-datalist__item__flag\"])[" + i + "]")))
				.build().perform();
		return removeFirstFlagHover.isDisplayed();
	}

	public void selectFlagged(WebDriver driver) {
		selectAllDropdown.click();
		flaggedOption.click();
	}

	public void removeFlags(WebDriver driver) {
		moreDropdown.click();
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(moreBlock));
		removeFlagsOption.click();
	}

	public boolean isNoFlagHoverDisplayed(WebDriver driver, int i) {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("(.//div[@class=\"b-datalist__item__flag\"])[" + i + "]")))
				.build().perform();
		return noFlagHover.isDisplayed();
	}

}
