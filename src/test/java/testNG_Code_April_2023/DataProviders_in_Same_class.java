package testNG_Code_April_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders_in_Same_class {

	public WebDriver driver;

	@Test(priority = 1,dataProvider = "Rediff")
	public void EnterRediffLoginDetails(String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("signinbtn")).click();
	}

	@DataProvider(name = "Rediff")
	public Object[][] getRediffData() {
		Object[][] data = { { "seleniumpanda@rediffmail.com", "Selenium@123" },
				           { "seleniumpanda@rediffmail.com", "Donkey@123" } };

		return data;
	}

	@Test(priority = 2, dataProvider = "TN")
		public void TNLoginDetails(String username, String password) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://tutorialsninja.com/demo");
			driver.findElement(By.linkText("Login")).sendKeys(username);
			driver.findElement(By.id("input-password")).sendKeys(password);
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}

	@DataProvider(name = "TN")
	public Object[][] getTNData() {
		Object[][] data = { { "seleniumpanda@gmail.com", "Selenium@123" },
				{ "seleniumpanda1@gmail.com", "Selenium@123" }, { "seleniumpanda2@gmail.com", "Selenium@123" },
				{ "seleniumpanda3@gmail.com", "Selenium@123" }, { "seleniumpanda4@gmail.com", "Selenium@123" } };
		
		return data;
	}

}
