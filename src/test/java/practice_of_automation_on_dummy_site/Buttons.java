package practice_of_automation_on_dummy_site;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Buttons {

	public WebDriver driver;

	@Test
	public void Buttons() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/elements");
		driver.findElement(By.xpath("//ul[@class = 'menu-list']/li[5]")).click();
		WebElement element = driver.findElement(By.id("doubleClickBtn"));
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();

		// Close the browser
		driver.quit();
	}
}