package main;

import org.openqa.selenium.WebDriver;

public class ObjectFactory {

	private CommonFunctionUtil cfu;
	private ElementFunctionUtil efu;
	private DriverClass dc;
	private HomePageFactory hpf;
	WebDriver driver;
	

	public CommonFunctionUtil getCfu() {
		cfu = new CommonFunctionUtil();
		return cfu;
	}

	public ElementFunctionUtil getEfu() {
		efu = new ElementFunctionUtil();
		return efu;
	}

	public DriverClass getdc() {
		dc = DriverClass.getClassInstance();
		return dc;
	}

	public HomePageFactory getHpf() {
		return hpf;
	}

}
