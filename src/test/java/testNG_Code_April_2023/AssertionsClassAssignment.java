package testNG_Code_April_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsClassAssignment {
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
	public void clickOnRegister() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();

	
	}

	@Test(priority = 3)
	public void registerUserWithoutEnteringanyField() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

		String actualPrivacyPolicyWarningMessage = driver.findElement(By.xpath("//div[@class = 'alert alert-danger alert-dismissible']")).getText();
		String expectedPrivacyPolicyWarningMessage = "Warning.You must agree to the Privacy Policy!";

		softassert.assertTrue(actualPrivacyPolicyWarningMessage.contains(expectedPrivacyPolicyWarningMessage),  "My Assertion is false");
	
		softassert.assertAll();
	}
	@Test(priority = 4)
	public void registerUserWithoutEnteringanyName() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

		String actualFirstNameWarningMessage = driver.findElement(By.xpath("//div[@class = 'text-danger']")).getText();
		String expectedFirstNameWarningMessage = "First Name must be between 1 and 32 characters!";

		softassert.assertEquals(actualFirstNameWarningMessage, expectedFirstNameWarningMessage);

		softassert.assertAll();
	}  
	@Test(priority =5)
	public void registerUserWithoutEnteringanyLastName() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

		String actualLastNameWarningMessage = driver.findElement(By.xpath("//div[@contains text(), = 'Last Name must be between 1 and 32 characters!']")).getText();
		String expectedLastNameWarningMessage = "Last Name must be between 1 and 32 characters!";

		softassert.assertEquals(actualLastNameWarningMessage, expectedLastNameWarningMessage);

		softassert.assertAll();
	}
	
	@Test(priority = 6)
	public void registerUserWithoutEnteringanyEmailAdress() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

		String actualEmailAddressWarningMessage = driver.findElement(By.xpath("//div[@contains text(), = 'E-Mail Address does not appear to be valid!']")).getText();
		String expectedEmailAddressWarningMessage = "E-Mail Address does not appear to be valid!";

		softassert.assertEquals(actualEmailAddressWarningMessage, expectedEmailAddressWarningMessage);

		softassert.assertAll();
	}
	@Test(priority = 7)
	public void registerUserWithoutEnteringanyTelephoneNumber() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

		String actualTelephoneNumberWarningMessage = driver.findElement(By.xpath("//div[@contains text(), = 'Telephone must be between 3 and 32 characters!']")).getText();
		String expectedTelephoneNumberWarningMessage = "Telephone must be between 3 and 32 characters!";

		softassert.assertEquals(actualTelephoneNumberWarningMessage, expectedTelephoneNumberWarningMessage);

		softassert.assertAll();
	}
	@Test (priority = 8)
	public void registerUserWithoutEnteringanyPassword() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

		String actualPasswordWarningMessage = driver.findElement(By.xpath("//div[@contains text(), = 'Password must be between 4 and 20 characters!']")).getText();
		String expectedPasswordWarningMessage = "Password must be between 4 and 20 characters!";

		softassert.assertEquals(actualPasswordWarningMessage, expectedPasswordWarningMessage);

		softassert.assertAll();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
