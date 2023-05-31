package automation_code_extra_topics;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Multiple_WebElements {

	public WebDriver driver;
	public ChromeOptions options;
	public Properties prop;
	public FileInputStream ip;

	@Test
	public void bbcNewsChannel()   {
		options = new ChromeOptions();
		options.addArguments("headless");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com");
		//find the total number of links in this instant in the bbc page
		List<WebElement> BBCLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links present in BBC at this instant is  :  " +BBCLinks.size());
		
	
		
		//If I want the 52nd link out of total 272 links
		WebElement Link52 = BBCLinks.get(51);
		
		//If I want the name of the 52nd link or the text
		System.out.println(Link52.getText());
		
		//If I want the coordinate of the 52nd link
		System.out.println("The x-coordinate is:  ->  "  + Link52.getLocation()  + "and y-coordinate is : -> "  +Link52.getLocation());
		
		//If I want to determine the URL of this link
		System.out.println(Link52.getAttribute("href"));
		
		//click on Link 52
		Link52.click();
		System.out.println("title of the 52nd link page of BBC is :  "  + driver.getTitle());
		
		//Print all the 277 links in the output console
		for(int i = 0; i<BBCLinks.size(); i++)   {
			WebElement AllLinks = BBCLinks.get(i);
			System.out.println(AllLinks.getText() + "---------------------> "  +AllLinks.isDisplayed());
			
			driver.quit();  
		}
	}
			
			@Test
			public void flipkart()  throws Exception {
			prop = new Properties();
			ip = new FileInputStream(System.getProperty("user.dir")+  "\\src\\test\\java\\automation_code_extra_topics\\config.properties");
			prop.load(ip);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("flipkartUrl"));
			List<WebElement> formalShirts = driver.findElements(By.xpath("//div[@class = '_2WkVRV']"));
			System.out.println("Total number of formal shirts in this page is  :  " + formalShirts.size());
			
			List<WebElement> prices = driver.findElements(By.xpath("//div[@class = '_30jeq3']"));
			
			
		    List<WebElement> discountpercentage = driver.findElements(By.xpath("//div[@class = '_3Ay6Sb']"));
			
			
			for(int i = 0; i<formalShirts.size(); i++)  {
				System.out.println(formalShirts.get(i).getText()  +  "-------->" + prices.get(i).getText()+ discountpercentage.get(i).getText());
			}
			System.out.println("-----------------------------------------------------------------------------------------------------");	
			
			driver.quit();
			}



			
			@Test
			public void rediffFooterLinks()   {
		    driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://rediff.com/");
			//total number of links
			List<WebElement> footerLinks = driver.findElements(By.cssSelector("div.footer.alignC > a"));
			System.out.println("Total number of footerLinks are  :  " + footerLinks.size());
			
			//Link with name and displayed or not
			for(int i =0 ; i<footerLinks.size(); i++ ) {
				WebElement AllLinks = footerLinks.get(i);
				System.out.println(AllLinks.getText() +  "------------------> "  + AllLinks.isDisplayed());
				System.out.println(footerLinks.get(i).getAttribute("href"));
				System.out.println("-----------------------------------------------------------------------------------------------------");	
				
				//click on each link and determine the title of that page
				footerLinks.get(i).click();
				System.out.println("Title of this webpage is  :  " + driver.getTitle());
				driver.get("https://rediff.com/");
				footerLinks = driver.findElements(By.cssSelector("div.footer.alignC > a"));
				
				driver.quit();
			}
			
			}
				
				
		
	}
