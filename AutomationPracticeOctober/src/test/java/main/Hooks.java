package main;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

public class Hooks {

	protected ObjectFactory of = new ObjectFactory();
	protected SoftAssert sa;

	
	
	@BeforeClass
	public void openBrowser() {
		 of.getdc().openSingletonBrowser("chrome", "http://automationpractice.com/index.php");
		  
	}
	
	@AfterClass
	public void quit() {
		of.getCfu().quit();
	}
}
