package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import main.DriverClass;

public class LogInPageFactory {

	public LogInPageFactory(WebDriver driver) {
		driver = DriverClass.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='email_create']")
	public WebElement inputEmail;
	
	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")
	public WebElement createAccount;
	
	@FindBy(xpath = "//input[@id='passwd']")
	public WebElement inputPassword;
	
	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")
	public WebElement signInBtn;
}
