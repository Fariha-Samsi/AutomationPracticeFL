package main;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class CommonFunctionUtil {

	DriverClass dc = DriverClass.getClassInstance();
	WebDriver driver = DriverClass.getDriver();

	public void goToUrl(String url) {
		driver.get(url);
	}

	public void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public void navigateBack() {
		driver.navigate().back();
	}

	public void navigateForward() {
		driver.navigate().forward();
	}

	public void refreshPage() {
		driver.navigate().refresh();
	}

	public void getTitle() {
		driver.getTitle();
	}

	public String getWindowHandle() {
		return driver.getWindowHandle();

	}

	public Set<String> getWindowHandles() {
		return driver.getWindowHandles();
	}

	public void close() {
		driver.close();
	}

	public void quit() {
		driver.quit();
	}

	public void sleep(int sec) {
		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}


	public void takeScreenShot(String filename, String path) {

		try {

			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE) ;

			//File destination = new File(filename+path+".jpg");

			Files.copy(source, new File(path+ filename +".jpg"));

		} catch (IOException e) {

			System.out.println("Unable to take screenShot!");
		}
	}
	
	public void takeScreenShot(String filename) {

		try {

			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE) ;

			File destination = new File("C:\\Users\\verc8\\git\\AutomationPracticeFL\\Screenshot\\"+ filename +".jpg");

			Files.copy(source, destination);

		} catch (IOException e) {

			System.out.println("Unable to take screenShot!");
		}
	}
}
