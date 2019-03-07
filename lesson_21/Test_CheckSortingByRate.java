package tests;

import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HotelPage;
import pages.ListOfHotelsPage;
import pages.MainPage;

public class Test_CheckSortingByRate {
	private WebDriver driver;
	private HotelPage hotelPage;
	private ListOfHotelsPage listOfHotelsPage;
	private MainPage mainPage;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		hotelPage = new HotelPage(driver);
		listOfHotelsPage = new ListOfHotelsPage(driver);
		mainPage = new MainPage(driver);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void checkHotelSortingByRate() throws InterruptedException {
		driver.get("https://www.booking.com/index.ru.html");
		mainPage.enterDestination("Москва");
		mainPage.enterDates();
		mainPage.clickGuestLabel();
		Assert.assertEquals(2, mainPage.currentAmountOfAdults());
		Assert.assertEquals(1, mainPage.currentAmountOfRooms());
		mainPage.clickSearchButton();
		assertTrue(listOfHotelsPage.isHotelLinkPresent(driver));
		listOfHotelsPage.clickExcellentRateAndPrice();
		hotelPage.clickFirstHotel();
		Set<String> windows = driver.getWindowHandles();
		for (String winHandle : windows) {
			driver.switchTo().window(winHandle);
		}
		assertTrue(hotelPage.getHotelRate() >= 9);

	}

}
