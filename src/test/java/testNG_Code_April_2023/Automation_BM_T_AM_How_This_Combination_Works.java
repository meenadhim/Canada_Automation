package testNG_Code_April_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Automation_BM_T_AM_How_This_Combination_Works {
	
	  public WebDriver driver;
	  
	  @BeforeMethod
	  public void openUrl() {
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://rediff.com");
	  }
	  @Test(priority = 1)
	  public void clickOnSigninLink() {
		  driver.findElement(By.className("signin")).click();
	  }
		  
		  @Test(priority = 2)
		  public void enterCredentials() {
			  driver.findElement(By.className("signin")).click();
			  driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
			  driver.findElement(By.id("password")).sendKeys("selenium@123");
		  }
      @Test(priority = 3)
      public void clickOnSignInButton() {
    	  driver.findElement(By.className("signin")).click();
		  driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		  driver.findElement(By.id("password")).sendKeys("selenium@123");
		  driver.findElement(By.className("signinbtn")).click();
      }
       @AfterMethod
       public void tearDown() {
    	   driver.quit();
       }
}