package main;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class CommonFunctionUtil {

	DriverClass dc = DriverClass.getClassInstance();
	WebDriver driver = dc.getDriver();

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
}