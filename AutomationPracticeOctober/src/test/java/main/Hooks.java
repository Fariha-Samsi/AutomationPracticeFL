package main;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Hooks {

	ObjectFactory of = new ObjectFactory();
	
	@BeforeClass
	public void openBrowser() {
		of.getdc().openSingletonBrowser("chrome", "https://www.amazon.com/?tag=admarketus-20&ref=pd_sl_a77559ED8D65AA122020110223");
	}
	
	@AfterClass
	public void quit() {
		of.getCfu().quit();
	}
}
