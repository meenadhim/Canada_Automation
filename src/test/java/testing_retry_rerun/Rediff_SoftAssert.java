package testing_retry_rerun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Rediff_SoftAssert {
	
	  public static WebDriver driver;
	  
	  
	  
	  @Test (retryAnalyzer = MyRetry.class)
      public void launchDriver()   {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
	  driver.findElement(By.id("password")).sendKeys("Selenium@123");
	  driver.findElement(By.className("signinbtn")).click();
	  Assert.fail("Trying to fail deliberately");
	  
	  }

}

// Go to testNG.org on google and click on documentation and scroll down to the link 'rerun failed tests' and copy the code from there.
