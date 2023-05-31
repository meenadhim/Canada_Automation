package testNG_Code_April_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assertions {

	public WebDriver driver;
	public SoftAssert softassert = new SoftAssert();

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
	}

	@Test(priority = 1)
	public void clickOnMyAccount() {
		driver.findElement(By.linkText("My Account")).click();
		softassert.assertAll();
	}

	@Test(priority = 2)
	public void clickOnLogin() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();

		WebElement returnCustomertext = driver.findElement(By.xpath("//h2[contains(text(), 'Returning Customer')]"));
		softassert.assertTrue(returnCustomertext.isDisplayed());

		WebElement emailIdtextBox = driver.findElement(By.id("input-email"));
		WebElement passwordtextBox = driver.findElement(By.id("input-password"));

		softassert.assertTrue(emailIdtextBox.isEnabled() && passwordtextBox.isEnabled());
		softassert.assertAll();
	}

	@Test(priority = 3)
	public void enterValidEmailAndValidPassword() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

		String actualMessage = driver.findElement(By.xpath("//a[contains(text(), 'Edit your account information')]"))
				.getText();
		String expectedMessage = "Edit your account information";

		softassert.assertTrue(actualMessage.contains(expectedMessage));
		softassert.assertAll();
	}

	@Test(priority = 4)
	public void enterValidEmailAndValidPasswordAndLogout() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

		String actualMessage = driver.findElement(By.xpath("//a[contains(text(), 'Edit your account information')]"))
				.getText();
		String expectedMessage = "Edit your account information";

		softassert.assertTrue(actualMessage.contains(expectedMessage));

		driver.findElement(By.linkText("Logout")).click();

		String expectedLogoutMessage = "You have been logged off your account. It is now safe to leave the computer.";
		String actualLogoutMessage = driver.findElement(By.xpath("//div[@id ='content']/child::p[1]")).getText();

		softassert.assertEquals(actualLogoutMessage, expectedLogoutMessage);
		softassert.assertAll();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
