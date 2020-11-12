package main;

import org.openqa.selenium.WebDriver;

public class Run {

	public static void main(String[] args) {

		WebDriver driver = null;
		DriverClass d = DriverClass.getClassInstance();
		
		d.openNonSingletonBrowser("firefox", "https://www.guru99.com/installing-selenium-webdriver.html");
		
	}

}
