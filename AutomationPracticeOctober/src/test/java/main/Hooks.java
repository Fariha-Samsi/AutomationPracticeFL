package main;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Hooks {

	ObjectFactory of = new ObjectFactory();
	
	@BeforeClass
	public void openBrowser() {
		of.getdc().openSingletonBrowser("chrome", "http://automationpractice.com/index.php");
	}
	
	@AfterClass
	public void quit() {
		of.getCfu().quit();
	}
}
