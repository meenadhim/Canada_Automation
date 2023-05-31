package testNG_Code_April_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Select_DropDown {
         
	    public WebDriver driver;
	    public Select select;
	    
	    
	    @Test
	    public void dropdownFacebook() throws InterruptedException  {
	    	driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    	driver.get("https://facebook.com");
	    	driver.findElement(By.linkText("Create new account")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.name("firstname")).sendKeys("Selenium");
	    	driver.findElement(By.name("lastname")).sendKeys("Panda");
	    	driver.findElement(By.name("reg_email__")).sendKeys("seleniumpanda@gmail.com");
	    	driver.findElement(By.name("reg_email_confirmation_")).sendKeys("seleniumpanda@gmail.com");
	    	driver.findElement(By.name("reg_passwd")).sendKeys("Selenium@123");
	    	
	    	select = new Select(driver.findElement(By.id("month")));
	    	select.selectByVisibleText("Mar");
	    	
	    	select = new Select(driver.findElement(By.id("day")));
	    	select.selectByVisibleText("9");
	    	
	    	select = new Select(driver.findElement(By.id("year")));
	    	select.selectByVisibleText("1999");
	    }
}
