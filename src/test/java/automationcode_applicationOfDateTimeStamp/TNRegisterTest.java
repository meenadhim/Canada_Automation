package automationcode_applicationOfDateTimeStamp;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TNRegisterTest {
	
	public WebDriver driver; 
	
	
    @Test (invocationCount = 5)
	 public void TnRegister() {
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://tutorialsninja.com/demo");
     driver.findElement(By.linkText("My Account")).click();
     driver.findElement(By.linkText("Register")).click();
     driver.findElement(By.id("input-firstname")).sendKeys("Selenium");
     driver.findElement(By.id("input-lastname")).sendKeys("Panda");
     driver.findElement(By.id("input-email")).sendKeys("seleniumpanda"  + dateTimeStamp()  + "@gmail.com");
     driver.findElement(By.id("input-telephone")).sendKeys("9876543210");
     driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
     driver.findElement(By.id("input-confirm")).sendKeys("Selenium@123");
     driver.findElement(By.name("agree")).click();
     driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
     String actualSuccessMessage = driver.findElement(By.xpath("//p[contains(text(), 'Congratulations! Your new account has been successfully created!'])")).getText();
     String expectedSuccessMessage = "Congratulations! Your new account has been successfully created!";
     Assert.assertTrue(actualSuccessMessage.contains(expectedSuccessMessage));
    }
    public String dateTimeStamp()   {
    	Date date = new Date();
    	return date.toString().replace(" ", "_").replace(":", "_");
    }
    @AfterMethod
    public void tearDown()  {
    	driver.quit();

}
}