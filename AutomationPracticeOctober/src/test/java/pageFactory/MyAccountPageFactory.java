package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import main.DriverClass;

public class MyAccountPageFactory {
	


	public MyAccountPageFactory(WebDriver driver) {

		driver = DriverClass.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1[contains(text(),'My account')]")
	public WebElement MyAccount;


	@FindBy(xpath = "//h1[contains(text(),'My account')]")
	public WebElement OrderLIst;

	@FindBy(xpath = "//h1[contains(text(),'My account')]")
	public WebElement CreditList;

	@FindBy(xpath = "//h1[contains(text(),'My account')]")
	public WebElement PersonalInfo;

	@FindBy(xpath = "//h1[contains(text(),'My account')]")
	public WebElement MyWishList;
	
}
