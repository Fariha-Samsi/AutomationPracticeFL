package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementFunctionUtil {

	DriverClass dc = DriverClass.getClassInstance();
	WebDriver driver = dc.getDriver();
	
	public void clickElement(String locator) {
		driver.findElement(By.xpath(locator)).click();
	}
	
	public void clearElement(String locator) {
		driver.findElement(By.xpath(locator)).clear();
	}
	
	public void getText(String locator) {
		driver.findElement(By.xpath(locator)).getText();
	}
	
	public void sendkeys(String locator, String key) {
		driver.findElement(By.xpath(locator)).sendKeys(key);
	}
}
