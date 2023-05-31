package testNG_Code_Batch_Running;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TN_LoginTest {

	public WebDriver driver;

	@Test(dataProvider = "TNLogin")
	public void TNLoginDetails(String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.linkText("Login")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}

	@DataProvider(name = "TNLogin")
	public static Object[][] getTNData() {
		Object[][] data = { { "seleniumpanda@gmail.com", "Selenium@123" } };

		return data;
	}

}
