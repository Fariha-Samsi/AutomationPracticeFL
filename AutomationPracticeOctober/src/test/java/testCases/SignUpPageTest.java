package testCases;
import java.util.Random;
import java.util.UUID;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import main.Hooks;
import main.ObjectFactory;

public class SignUpPageTest extends Hooks {

	ObjectFactory of = new ObjectFactory();
	Select sc;

	String expected,actual;

	@Test 
	public void signUp() {

		String uuid = UUID.randomUUID().toString();
		sa = new SoftAssert();
		
		of.getHpf().SignIn.click();
		of.getLpf().inputEmail.sendKeys(uuid +"@test.com");
		of.getLpf().createAccount.click();

		of.getSpf().MrRadioBtn.click();
		of.getSpf().inputFirstName.sendKeys("hfjh");
		of.getSpf().inputLastName.sendKeys("hfjh");
		of.getSpf().inputPasswd.sendKeys("Hello6");

		sc = new Select(of.getSpf().days);
		sc.selectByIndex(3);
		of.getCfu().sleep(5);
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
		of.getCfu().sleep(1);
		sc = new Select(of.getSpf().months);
		sc.selectByIndex(10);
		of.getCfu().sleep(1);
		sc = new Select(of.getSpf().years);
		sc.selectByIndex(9);
		of.getCfu().sleep(1);

		of.getSpf().firstName.sendKeys("hg"); 
		of.getSpf().lastName.sendKeys("jfg"); 
		of.getSpf().address.sendKeys(uuid +"ave"); 
		of.getSpf().City.sendKeys("Li"); 
		of.getSpf().State.sendKeys("la"); 
		of.getSpf().ZipCode.sendKeys("11234");
		of.getSpf().MobilePhone.sendKeys("234567890"); 
		of.getSpf().AddressAlias.sendKeys("House"); 
		of.getSpf().RegisterBn.click();
		of.getCfu().sleep(3);
		
		actual = of.getmapf().MyAccount.getText();
		expected = "MY ACCOUNT";
		sa.assertEquals(actual, expected);
		sa.assertAll();
	}		
	}		
}
