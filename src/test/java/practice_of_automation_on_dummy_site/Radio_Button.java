package practice_of_automation_on_dummy_site;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Radio_Button {
	
	
	  public WebDriver driver;
      public SoftAssert softassert;
	
	@Test 
	public void RadioButton()    {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/elements");
		driver.findElement(By.xpath(" //span[contains(text(),'Radio Button')]")).click();
        driver.findElement(By.xpath("//label[contains(text(),'Yes')]")).click();
        
        
        softassert  = new SoftAssert();
		softassert.assertTrue(driver.findElement(By.xpath("//span[@class = 'text-success']")).isDisplayed());
		softassert.assertAll();
		driver.quit();
}
}