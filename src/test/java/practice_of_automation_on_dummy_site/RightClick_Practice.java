package practice_of_automation_on_dummy_site;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RightClick_Practice {

	public WebDriver driver;
	public Actions actions;
	public SoftAssert softassert;

	@Test
	public void RightClick() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoqa.com/elements");
		driver.findElement(By.xpath("//ul[@class = 'menu-list']/li[5]")).click();

		WebElement RightClickbtn = driver.findElement(By.xpath("//button[contains(text(), 'Right Click Me')]"));
		actions = new Actions(driver);
		actions.moveToElement(RightClickbtn).contextClick().build().perform();
		softassert = new SoftAssert();
		softassert.assertTrue(driver.findElement(By.id("rightClickMessage")).isDisplayed());
		softassert.assertAll();
		driver.quit();
	}
}
