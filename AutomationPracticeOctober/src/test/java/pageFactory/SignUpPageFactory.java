package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import main.DriverClass;

public class SignUpPageFactory {

	public SignUpPageFactory(WebDriver driver) {
		driver = DriverClass.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='id_gender1']")
	public WebElement MrRadioBtn;
	
	@FindBy(xpath = "//input[@id='customer_firstname']")
	public WebElement inputFirstName;
	
	@FindBy(xpath = "//input[@id='customer_lastname']")
	public WebElement inputLastName;
	
	@FindBy(xpath = "//input[@id='passwd']")
	public WebElement inputPasswd;
	
	@FindBy(xpath = "//select[@id='days']")
	public WebElement days;
	
	@FindBy(xpath = "//select[@id='months']")
	public WebElement months;
	
	@FindBy(xpath = "//select[@id='years']")
	public WebElement years;
	
	@FindBy(xpath = "//input[@id='firstname']")
	public WebElement firstName;
	
	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement lastName;
	
	@FindBy(xpath = "//input[@id='address1']")
	public WebElement address;
	
	@FindBy(xpath = "//input[@id='city']")
	public WebElement City;
	
	@FindBy(xpath = "//select[@id='id_state']")
	public WebElement State;
	
	@FindBy(xpath = "//input[@id='postcode']")
	public WebElement ZipCode;
	
	@FindBy(xpath = "//input[@id='phone_mobile']")
	public WebElement MobilePhone;
	
	@FindBy(xpath = "//input[@id='alias']")
	public WebElement AddressAlias;
	
	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]")
	public WebElement RegisterBn;
}
