package automation_code_extra_topics;


import java.io.FileInputStream;
import java.util.Properties;

import org.asynchttpclient.Request;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Response_Code {
	
	public WebDriver driver;
	public Properties prop;
	public FileInputStream ip;
	 
	
	@Test
	public void validateResponseCode() throws Exception   {
		prop = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\automation_code_extra_topics\\config.properties");
		prop.load(ip);
		int responsecode = Request.Get(prop.getProperty("rediffUrl")). execute().returnResponse().getStatusLine().getStatusCode();
		System.out.println("Response code for Rediff Home page Url is : "  +  responsecode);
		
		if(responsecode == 200)  {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("rediffUrl"));
		}else  {
			System.out.println("Response code is not 200");
			
					
		}
		
	}

}
