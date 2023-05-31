package practice_of_automation_on_dummy_site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Text_Practice {
	
	public WebDriver driver;
	
	@Test 
	public void EnterTextinDummySite()    {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/elements");
		driver.findElement(By.className("header-wrapper")).click();
		driver.findElement(By.className("text")).click();
		driver.findElement(By.id("//input[@id='userName']")).sendKeys("Meenakshi Dhiman");
		driver.findElement(By.id("//input[@id='userEmail']")).sendKeys("meenakshi.hsu@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("33 Troutbeck Crescent");
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("33 Troutbeck Crescent");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	}
}

      
      