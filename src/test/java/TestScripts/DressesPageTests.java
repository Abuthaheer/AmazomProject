package TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.DressesPageObject;
import pageObject.HomePageObject;

public class DressesPageTests {

	HomePageObject hp;
	DressesPageObject dp;

	public DressesPageTests() {
		hp = new HomePageObject();
		dp = new DressesPageObject();
	}

	@Test
	public void verifyProductCount() {

		hp.clickDresses();
		Assert.assertTrue(dp.getProductCountFromHeader() == dp.getProductsCount().size(), 
				"Failed : Count mismatched");

	}

}
