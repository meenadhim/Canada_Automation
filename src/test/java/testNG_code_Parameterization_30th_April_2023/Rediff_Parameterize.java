package testNG_code_Parameterization_30th_April_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Rediff_Parameterize {

	public WebDriver driver;

	@Test
	@Parameters({ "browser", "url", "username", "password" })
	public void rediffLoginTest(String browser, String url, String username, String password ,String locatorUsername, String locatorPassword,  String locatorSignInButton) {
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}

		driver.get(url);
		driver.findElement(By.id(locatorUsername)).sendKeys(username);
		driver.findElement(By.id( locatorPassword)).sendKeys(password);
		driver.findElement(By.className(locatorSignInButton)).click();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}