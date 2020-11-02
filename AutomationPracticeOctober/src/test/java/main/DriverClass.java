package main;

import org.openqa.selenium.WebDriver;

public class DriverClass {

	private static WebDriver driver;
	
	 static DriverClass classInstance = null;
	
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public DriverClass getClassInstance() {
		if(classInstance == null)
			 classInstance = new DriverClass(driver);
		return classInstance; 
			
	}
	
	 public DriverClass(WebDriver driver) {
		driver = this.driver;
	}
	 
	 public WebDriver openSingletonBrowser() {
		 
		 
		 return driver;
	 }
}
