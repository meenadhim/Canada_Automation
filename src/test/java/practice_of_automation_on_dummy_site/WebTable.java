package practice_of_automation_on_dummy_site;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class WebTable {
	
	
	public WebDriver driver;
    
	
	@Test 
	public void WebTable()    {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/elements");
		driver.findElement(By.xpath(" //div[@class='element-list collapse show']//li[@id='item-3']")).click();
        driver.findElement(By.id("addNewRecordButton")).click();
        driver.findElement(By.id("firstName")).sendKeys("Radhika");
        driver.findElement(By.id("lastName")).sendKeys("Sharma");
        driver.findElement(By.id("userEmail")).sendKeys("radhikasharma@gmail.com");
        driver.findElement(By.id("age")).sendKeys("35");
        driver.findElement(By.id("salary")).sendKeys("5000");
        driver.findElement(By.id("department")).sendKeys("Insurance");
        driver.findElement(By.xpath(" //button[@id='submit']")).click();
}

}