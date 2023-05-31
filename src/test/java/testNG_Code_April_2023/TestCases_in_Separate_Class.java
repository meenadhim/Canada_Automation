package testNG_Code_April_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCases_in_Separate_Class {
	
	
	public static WebDriver driver;

	@Test(priority = 1,dataProvider = "Rediff" , dataProviderClass = DataProviders_in_SeparateClass .class)
	public static void EnterRediffLoginDetails(String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("signinbtn")).click();
	}

@Test(priority = 2, dataProvider = "TN", dataProviderClass = DataProviders_in_SeparateClass .class)
public static void TNLoginDetails(String username, String password) {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://tutorialsninja.com/demo");
	driver.findElement(By.linkText("Login")).sendKeys(username);
	driver.findElement(By.id("input-password")).sendKeys(password);
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	
}
}