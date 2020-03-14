package TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.LoginObject;

public class LoginTest {

	LoginObject lg;

	public LoginTest() {
		lg = new LoginObject();
	}

	@Test
	public void verifyLoginSuccess() {
		lg.loginToApp("Abu", "Test");
		String title = lg.getTitlte();
		Assert.assertTrue(title.contains("Search"), "Failed: Login is failed");
	}

	@Test
	public void verifyUserName() {
		lg.setUserName("Automation");
		String enteredValue = lg.getUserName();
		Assert.assertTrue(enteredValue.equals("Automation"), "Failed: User Name not entered");

	}

}
