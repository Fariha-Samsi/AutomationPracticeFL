package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverClass {

	private static WebDriver driver; // here it was protected
	
	 private static DriverClass classInstance = null;
	
	
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
	 
	 public WebDriver openSingletonBrowser(String browser, String url) {
		 if(driver== null) {
			 if(browser.equalsIgnoreCase("Chrome")) {
				 driver = new ChromeDriver();
				 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				 driver.manage().window().maximize();
				 driver.get("https://www.google.com/");
				 driver.navigate().to(url);
			 }
			 else if(browser.equalsIgnoreCase("firefox")) {
				 driver = new FirefoxDriver();
				 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				 driver.manage().window().maximize();
				 driver.get("https://www.google.com/");
				 driver.navigate().to(url);
			 }
			 
			 else
			 {
				 System.out.println("Incorrect driver!!");
			 }
		 }
		 return driver;
	 }
	 
	 public WebDriver openNonSingletonBrowser(String browser,String url) {
		 
			 if(browser.equalsIgnoreCase("Chrome")) {
				 driver = new ChromeDriver();
				 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				 driver.manage().window().maximize();
				 driver.get("https://www.google.com/");
				 driver.navigate().to(url);
			 }
			 else if(browser.equalsIgnoreCase("firefox")) {
				 driver = new FirefoxDriver();
				 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				 driver.manage().window().maximize();
				 driver.get("https://www.google.com/");
				 driver.navigate().to(url);
			 }
			 
			 else
			 {
				 System.out.println("Incorrect driver!!");
			 }
		 
		 return driver;
	 }
	 
	  
}
