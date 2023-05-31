package testNG_Code_April_2023;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TriCombo {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Starting before each test case");
	}

	@Test
	public void testCase1() {
		System.out.println("Test Case 1");
	}

	@Test
	public void testCase2() {
		System.out.println("Test Case 2");
	}

	@Test
	public void testCase3() {
		System.out.println("Test Case 3");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Ending after each test case");
	}
}