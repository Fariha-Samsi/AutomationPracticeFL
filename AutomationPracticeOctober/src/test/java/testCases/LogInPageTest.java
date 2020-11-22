package testCases;

import org.testng.annotations.Test;

import main.Hooks;
import main.ObjectFactory;

public class LogInPageTest extends Hooks {

	ObjectFactory of = new ObjectFactory();
	
	@Test
	public void createAnAccount() {
		of.getLpf().inputEmail.sendKeys("blabla@test.com");
		of.getLpf().createAccount.click();
	}
}
