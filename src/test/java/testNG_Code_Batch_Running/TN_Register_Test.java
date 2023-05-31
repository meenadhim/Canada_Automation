package testNG_Code_Batch_Running;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TN_Register_Test {
	
	public WebDriver driver; 
	
	
      @Test(dataProvider = "TNRegister")
	 public void TnRegister(String firstname, String lastname, String username, String phonenumber, String password, String confirmpassword ) {
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://tutorialsninja.com/demo");
     driver.findElement(By.linkText("My Account")).click();
     driver.findElement(By.linkText("Register")).click();
     driver.findElement(By.id("input-firstname")).sendKeys(firstname);
     driver.findElement(By.id("input-lastname")).sendKeys(lastname);
     driver.findElement(By.id("input-email")).sendKeys(username);
     driver.findElement(By.id("input-telephone")).sendKeys(phonenumber);
     driver.findElement(By.id("input-password")).sendKeys(password);
     driver.findElement(By.id("input-confirm")).sendKeys(confirmpassword);
     driver.findElement(By.name("agree")).click();
     driver.findElement(By.cssSelector("btn btn-primary")).click();
     driver.findElement(By.linkText("Continue")).click();
      }
     
     @DataProvider(name = "TNRegister")
 	public static Object[][] getTNData() {
 		Object[][] data = { { "Selenuim", "Panda", "seleniumpanda123@gmail.com", "9876543210", "Selenium@123", "Selenium@123" } };

 		return data;

}
}