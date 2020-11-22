package testCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import main.Hooks;
import main.ObjectFactory;

public class HomePageTest extends Hooks {

	String actual;
	String expected;
	
	@Test
	public void homePage() {
		SoftAssert sa = new SoftAssert();
		expected = "My Store";
		actual = of.getCfu().getTitle();
		sa.assertEquals(actual, expected);
		sa.assertAll();
			}
	
	@Test
	public void signIn() {
		sa = new SoftAssert();
		of.getCfu().sleep(3);
		of.getHpf().SignIn.click();
		expected = "Login - My Store";
		actual = of.getCfu().getTitle();
		sa.assertEquals(actual, expected);
		sa.assertAll();
	}
	
	
}
