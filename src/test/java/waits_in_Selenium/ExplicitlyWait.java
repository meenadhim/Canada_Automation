package waits_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExplicitlyWait {
	
	//whatever time you will ask selenium to wait, it will wait
		//declared by the programmer
	
	public WebDriver driver;
	
	@Test
	public void TNExplicitWait() throws Exception   {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo");
	driver.findElement(By.linkText("My Account")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Login")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input.btn.bt.-primary")).click();
	Thread.sleep(2000);
	Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
	}
	
	
	

}
