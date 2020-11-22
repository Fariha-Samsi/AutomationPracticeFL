package main;

import org.openqa.selenium.WebDriver;

import pageFactory.HomePageFactory;
import pageFactory.LogInPageFactory;
import pageFactory.MyAccountPageFactory;
import pageFactory.SignUpPageFactory;

public class ObjectFactory {

	private CommonFunctionUtil cfu;
	private ElementFunctionUtil efu;
	private DriverClass dc;
	private HomePageFactory hpf;
	private LogInPageFactory lpf;
	private SignUpPageFactory spf;
	private MyAccountPageFactory mapf;
	
	//WebDriver driver;
	

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
		hpf= new HomePageFactory(DriverClass.getDriver());
		return hpf;
	}

	public LogInPageFactory getLpf() {
		lpf = new LogInPageFactory(DriverClass.getDriver());
		return lpf;
	}

	public SignUpPageFactory getSpf() {
		spf = new SignUpPageFactory(DriverClass.getDriver());
		return spf;
	}
	
	public MyAccountPageFactory getmapf() {
		mapf = new MyAccountPageFactory(DriverClass.getDriver());
		return mapf;
	}

}
