package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject extends BasePage {

	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement tabDresses;

	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}

	public void clickDresses() {
		tabDresses.click();
	}

}
