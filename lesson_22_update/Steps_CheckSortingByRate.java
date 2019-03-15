package junitcucumber;

import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junitcucumber.HotelPage;
import junitcucumber.ListOfHotelsPage;
import junitcucumber.MainPage;

public class Steps_CheckSortingByRate {
	private WebDriver driver;
	private HotelPage hotelPage;
	private ListOfHotelsPage listOfHotelsPage;
	private MainPage mainPage;

	public Steps_CheckSortingByRate() {
		driver = new ChromeDriver();
		hotelPage = new HotelPage(driver);
		listOfHotelsPage = new ListOfHotelsPage(driver);
		mainPage = new MainPage(driver);
	}

	@Given("^I am on the main application page$")
	public void loadMainPage() {
		driver.get("https://www.booking.com/index.ru.html");
	}

	@When("^I enter the needed destination$")
	public void enterTripDestination() {
		mainPage.enterDestination("Москва");
	}

	@And("^I enter the needed dates$")
	public void enterDates() {
		mainPage.enterDates();
	}

	@And("^I leave the default amount of guests and rooms$")
	public void leaveDefaultGuestsAndRooms() {
		mainPage.clickGuestLabel();
		Assert.assertEquals(2, mainPage.currentAmountOfAdults());
		Assert.assertEquals(1, mainPage.currentAmountOfRooms());
	}

	@And("^I make search$")
	public void clickSearchButton() {
		mainPage.clickSearchButton();
	}

	@And("^I make sure there are hotels that satisfy the search criteria$")
	public void seeHotelIsFound() {
		assertTrue(listOfHotelsPage.isHotelLinkPresent(driver));
	}

	@And("^I sort hotels by rate and price$")
	public void clickExcellentRateAndPrice() {
		listOfHotelsPage.clickExcellentRateAndPrice();
	}

	@And("^I look at the details of the 1st hotel$")
	public void openHotelDetailsPage(){
		hotelPage.clickFirstHotel(driver);
		Set<String> windows = driver.getWindowHandles();
		for (String winHandle : windows) {
			driver.switchTo().window(winHandle);
		}
	}

	@Then("^I make sure its rate is 9 or higher$")
	public void isRateNineOrHigher() {
		assertTrue(hotelPage.getHotelRate() >= 9);
	}

	@After
	public void afterClass() {
		driver.quit();
	}
}
