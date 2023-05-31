package automation_code_extra_topics;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HeadlessMode {
	
	public WebDriver driver;
	public ChromeOptions options;
	public SoftAssert softassert;
	public FirefoxOptions options1;
	
	
	@Test (priority = 1)
	public void chromeBrowserHeadlessMode()   {
		//Important Note:  Please do not use setPageLoadStrategy() Method in headless mode
		options = new ChromeOptions();
		options.addArguments("headless");
		options.addArguments("--no-sandbox");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation" , "disable-infobars"));
		driver = new ChromeDriver(options);
		driver.get("https://tutorilasninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		System.out.println("Title of this page is : " + driver.getTitle() );
		
		softassert  = new SoftAssert();
		softassert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		softassert.assertAll();
		driver.quit();
		
		
	}
    @Test  (priority = 2)
    public void firefoxBrowserHeadlessMode()   {
    	options1 = new FirefoxOptions();
    	options1.addPreference("dom.notification.enabled", false);
    	options.addArguments("--disable.gpu");
    	options1.setAcceptInsecureCerts(true);
    	options1.addArguments("--headless");
    	driver = new FirefoxDriver(options1);
    	driver.get("https://tutorilasninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		System.out.println("Title of this page is : " + driver.getTitle());
		
		softassert  = new SoftAssert();
		softassert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		softassert.assertAll();
		driver.quit();
		
    }
}
