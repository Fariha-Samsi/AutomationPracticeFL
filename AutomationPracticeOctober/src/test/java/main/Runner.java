package main;

import org.testng.annotations.Test;

public class Runner extends Hooks {

	@Test
	public static void main() {

		ObjectFactory of = new ObjectFactory();		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\verc8\\git\\AutomationPracticeFL\\Drivers\\chromedriver.exe");

		of.getCfu().takeScreenShot("HPage");

	}



}
