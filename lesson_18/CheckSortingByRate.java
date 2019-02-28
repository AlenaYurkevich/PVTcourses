package core;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckSortingByRate {
	private WebDriver driver;

	@Before
	public void setUp() {
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	public void checkThereAreHotelsForDefaultValuesInMoscow() throws InterruptedException {
		// open Booking.com in Russian and type in "Москва" for search
		driver.get("https://www.booking.com/index.ru.html?lang=ru");
		WebElement searchFieldDestination = driver
				.findElement(By.xpath(".//input[@data-component=\"search/destination/input-placeholder\"]"));
		searchFieldDestination.clear();
		searchFieldDestination.sendKeys("Москва");
		Thread.sleep(2000);

		// select 2 guests and 1 room
		WebElement guestLabel = driver.findElement(By.xpath(".//label[@id=\"xp__guests__toggle\"]"));
		guestLabel.click();
		Thread.sleep(2000);
		WebElement amountOfAdults = driver.findElement(By.xpath("(.//span[@data-bui-ref=\"input-stepper-value\"])[2]"));
		assertEquals(2, Integer.parseInt(amountOfAdults.getText()));
		WebElement amountOfRooms = driver.findElement(By.xpath("(.//span[@data-bui-ref=\"input-stepper-value\"])[1]"));
		assertEquals(1, Integer.parseInt(amountOfRooms.getText())); 
		WebElement searchButton = driver.findElement(By.xpath(".//button[@class=\"sb-searchbox__button  \"]"));
		searchButton.submit();
		Thread.sleep(3000);

		// check there are hotels
		WebElement linkToHotel = driver.findElement(By.xpath("(.//a[@class =\"hotel_name_link url\"])[1]"));
		assertTrue(linkToHotel.isDisplayed());
		Thread.sleep(3000);
	}

	@Test
	public void checkSortingByRate() throws InterruptedException {

		checkThereAreHotelsForDefaultValuesInMoscow();

		// sort by maximum rating
		WebElement excellentRateAndPrice = driver
				.findElement(By.xpath(".//a[@data-category=\"review_score_and_price\"]"));
		Thread.sleep(3000);
		excellentRateAndPrice.click();
		Thread.sleep(2000);

		// open the 1st hotel among sorted and check its rating is 9 or more
		String currentWindowHandle = driver.getWindowHandle();
		WebElement firstHotel = driver.findElement(By.xpath("(.//a[@class=\"hotel_name_link url\"])[1]"));
		Thread.sleep(1000);
		firstHotel.click();

		ArrayList<String> windowHandles = new ArrayList<String>(driver.getWindowHandles());
		for (String window : windowHandles) {
			// if it contains the current window we want to eliminate that from switchTo();
			if (window != currentWindowHandle) {
				// Now switchTo new Tab.
				driver.switchTo().window(window);
				WebElement rate = driver.findElement(By.xpath("(.//div[@class=\"bui-review-score__badge\"])[1]"));
				assertTrue(Integer.parseInt(rate.getText()) >= 9);
				Thread.sleep(1000);
				// Close the newly opened tab
				driver.close();
			}
		}
	}
}