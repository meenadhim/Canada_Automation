package testNG_Code_Batch_Running;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RediffLoginTest {
	
	public WebDriver driver;

	@Test(dataProvider = "rediffLogin")
	    public void rediffLogin(String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("signinbtn")).click();
	}
		
		
		@DataProvider(name = "Rediff")
		public Object[][] getrediffLogin() {
			Object[][] data = { { "seleniumpanda@rediffmail.com", "Selenium@123"}};
			
			return data;

}
}