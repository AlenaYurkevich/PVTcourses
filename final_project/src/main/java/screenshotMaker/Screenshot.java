package screenshotMaker;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	public static void makeScreenShot(WebDriver driver) throws IOException {
		File fileScreenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(fileScreenShot, new File("/Users/alenayurkevich/Documents/" + System.currentTimeMillis() + ".png"));
		} catch (IOException exception) {
			throw exception;
		}
	}
}
