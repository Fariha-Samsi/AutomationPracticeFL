package main;

import org.openqa.selenium.WebDriver;

public class Runner {

	public static void main(String[] args) {
		WebDriver driver = null;
		
		DriverClass d = new DriverClass(driver);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\verc8\\git\\AutomationPracticeFL\\Drivers\\chromedriver.exe");
		
		d.openSingletonBrowser("chrome", "https://www.amazon.com/?tag=admarketus-20&ref=pd_sl_a77559ED8D65AA122020110223");
	}

}
