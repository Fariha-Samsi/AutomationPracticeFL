package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFactory {
	
	public HomePageFactory(WebDriver driver) {
		
		driver = DriverClass.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@title= 'Contact Us']")
	public WebElement ContactUsBtn;
	
	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	public WebElement SignIn;
	
	
	@FindBy(xpath = "//a[@title='Women']")
	public WebElement Women;
	
	@FindBy(xpath = "//a[@title='Dresses']")
	public WebElement Dresses;
	
	@FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")
	public WebElement Tshirts;

	
}
