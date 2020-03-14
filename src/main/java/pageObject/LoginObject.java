package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObject extends BasePage {

	@FindBy(id = "username")
	private WebElement txtBoxuser;

	@FindBy(id = "password")
	private WebElement txtBoxpass;

	@FindBy(id = "login")
	private WebElement btnLogin;

	public LoginObject() {
		PageFactory.initElements(driver, this);
	}

	public void loginToApp(String user, String pass) {
		setText(txtBoxuser, user);
		setText(txtBoxpass, pass);
		btnLogin.click();
	}

	public void setUserName(String user) {
		setText(txtBoxuser, user);
	}

	public String getUserName() {
		return getTxtAttribute(txtBoxuser);
	}

}
