package pageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DressesPageObject extends BasePage {

	@FindBy(className = "heading-counter")
	private WebElement txtHeader;

	@FindBys(@FindBy(xpath = "//ul[@class='product_list grid row']/li"))
	private List<WebElement> lstPrducts;

	public DressesPageObject() {
		PageFactory.initElements(driver, this);
	}

	public int getProductCountFromHeader() {
		/*
		 * String txt = txtHeader.getText(); String [] arr = txt.split(" ");
		 * String value = arr[2]; int result = Integer.parseInt(value); return
		 * result;
		 */

		return Integer.parseInt(txtHeader.getText().split(" ")[2]);

	}

	public List<WebElement> getProductsCount() {
		return lstPrducts;
	}

	

}
