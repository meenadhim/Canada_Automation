package testNG_code_Parameterization_30th_April_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TNRegister_Parameterize {
        
	      public WebDriver driver;

	@Test
	@Parameters({ "browser", "url", "LinkMyAccount", "LinkRegister" , "LinkFirstName", "LinkLastName", "LinkEmail", "LinkTelephone", "Linkpassword", "LinkpasswordConfirm","FirstName", "LastName", "Email", "Telephone", "password", "passwordConfirm","PolicyButton", "ContinueButton"})
	public void TNRegisterTest(String browser, String url, String LinkMyAccount, String LinkRegister,  String LinkFirstName, String LinkLastName, String LinkEmail, String LinkTelephone, String Linkpassword, String LinkpasswordConfirm, String FirstName, String LastName, String Email, String Telephone,String password, String passwordConfirm, String PolicyButton,String ContinueButton) {
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}

		 driver.get(url);
		 driver.findElement(By.linkText(LinkMyAccount)).click();
	     driver.findElement(By.linkText(LinkRegister)).click();
	     driver.findElement(By.xpath(LinkFirstName)).sendKeys(FirstName);
	     driver.findElement(By.xpath(LinkLastName)).sendKeys(LastName);
	     driver.findElement(By.xpath(LinkEmail)).sendKeys(Email);
	     driver.findElement(By.xpath(LinkTelephone)).sendKeys(Telephone);
	     driver.findElement(By.xpath(Linkpassword)).sendKeys(password);
	     driver.findElement(By.xpath(LinkpasswordConfirm)).sendKeys(passwordConfirm);
	     driver.findElement(By.xpath(PolicyButton)).click();
	     driver.findElement(By.cssSelector(ContinueButton)).click();
	}
	     
      @AfterMethod
	public void teardown() {
		driver.quit();
	}
}

