package File_Handling;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Reading_From_Properties_File {
	
	public WebDriver driver;
	public Properties prop;
	public FileInputStream ip;
	
	
	@Test(priority = 1)
	    public void TNLoginDetails() throws Exception {
	    prop = new Properties();{
	    ip = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\File_Handling\\config.properties");
	    prop.load(ip);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("ValidUsername"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("ValidPassword"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		driver.quit();
	}
	}
		
		
		@Test(priority  =2)
	    public void rediffLogin() throws Exception{
		prop = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\File_Handling\\config.properties");
	    prop.load(ip);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("urlR"));
		driver.findElement(By.id("login1")).sendKeys(prop.getProperty("ValidUsernameR"));
		driver.findElement(By.id("password")).sendKeys((prop.getProperty("ValidPasswordR")));
		driver.findElement(By.className("signinbtn")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		driver.quit();
	}

}
