package junitcucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
	@FindBy(xpath = ".//input[@data-component=\"search/destination/input-placeholder\"]")
	private WebElement searchFieldDestination;

	@FindBy(xpath = "(.//span[@class=\"sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb\"])[1]")
	private WebElement checkInDateSpan;

	@FindBy(xpath = ".//td[@data-date=\"2019-03-20\"]")
	private WebElement selectedCheckInDate;

	@FindBy(xpath = ".//td[@data-date=\"2019-03-25\"]")
	private WebElement selectedCheckOutDate;

	@FindBy(xpath = ".//label[@id=\"xp__guests__toggle\"]")
	private WebElement guestLabel;

	@FindBy(xpath = "//div[@class=\"sb-group__field sb-group__field-adults\"]/descendant::span[@class=\"bui-stepper__display\"]")
	private WebElement amountOfAdults;

	@FindBy(xpath = "//div[@class=\"sb-group__field sb-group__field-rooms\"]/descendant::span[@class=\"bui-stepper__display\"]")
	private WebElement amountOfRooms;

	@FindBy(xpath = ".//button[@class=\"sb-searchbox__button  \"]")
	private WebElement searchButton;

	public MainPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterDestination(String city) {
		searchFieldDestination.clear();
		searchFieldDestination.sendKeys(city);
	}

	public void enterDates() {
		checkInDateSpan.click();
		selectedCheckInDate.click();
		selectedCheckOutDate.click();
	}
	
	public void clickGuestLabel(){
		guestLabel.click();
	}

	public int currentAmountOfAdults() {
		return Integer.parseInt(amountOfAdults.getText());
	}

	public int currentAmountOfRooms() {
		return Integer.parseInt(amountOfRooms.getText());
	}

	public void clickSearchButton() {
		searchButton.click();
	}

}
