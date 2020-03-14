package TestScripts;

import org.testng.annotations.*;

public class TestAnnotation {

	@Test(groups = {"Abu"})
	public void testCase3() {
		System.out.println("in test case 3");
	}

	@Test(groups = {"Abu", "Regression"})
	public void testCase1() {
		System.out.println("in test case 1");
	}

	@Test(groups = {"Sanity"})
	public void testCase2() {
		System.out.println("in test case 2");
	}

	@Test(enabled = false)
	public void testCase4() {
		System.out.println("in test case 4");
	}

}
