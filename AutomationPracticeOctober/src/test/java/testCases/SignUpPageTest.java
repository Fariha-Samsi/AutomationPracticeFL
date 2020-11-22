package testCases;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import main.Hooks;
import main.ObjectFactory;

public class SignUpPageTest extends Hooks{

	ObjectFactory of = new ObjectFactory();
	Select sc;
	@Test
	public void signUp() {
		
		//of.getEfu().clickElement(of.getHpf().SignIn);
		of.getHpf().SignIn.click();
		of.getLpf().inputEmail.sendKeys("blabla@test.com");
		of.getLpf().createAccount.click();

		of.getSpf().MrRadioBtn.click();
		of.getSpf().inputFirstName.sendKeys("Ram");
		of.getSpf().inputLastName.sendKeys("Kumar");
		of.getSpf().inputPasswd.sendKeys("Hello5");
		
		//of.getSpf().days.click();
		sc = new Select(of.getSpf().days);
		sc.selectByIndex(3);
		of.getCfu().sleep(5);
		//of.getSpf().months.click();
//		of.getSpf().years.click();
//		of.getSpf().firstName.sendKeys("Ram");
//		of.getSpf().lastName.sendKeys("Kumar");
//		of.getSpf().address.sendKeys("123 13 456 Avenue");
//		of.getSpf().City.sendKeys("Li");
//		of.getSpf().State.sendKeys("la");
//		of.getSpf().MobilePhone.sendKeys("1234567891");
//		of.getSpf().AddressAlias.sendKeys("House");
//		of.getSpf().RegisterBn.click();
	}
}
