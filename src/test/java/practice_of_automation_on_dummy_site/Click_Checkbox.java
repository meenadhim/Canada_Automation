package practice_of_automation_on_dummy_site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Click_Checkbox {
      
	
        public WebDriver driver;
        public SoftAssert softassert;
	
	@Test 
	public void CheckBox()    {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/elements");
		driver.findElement(By.xpath("//span[contains(text(),'Check Box')]")).click();
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[1]")).click();
		
		softassert  = new SoftAssert();
		softassert.assertTrue(driver.findElement(By.xpath("//div[@id='result']")).isDisplayed());
		softassert.assertAll();
		driver.quit();
		
}
}