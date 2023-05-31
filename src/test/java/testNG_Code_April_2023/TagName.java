package testNG_Code_April_2023;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TagName {
	
	public WebDriver driver;

	@Test()
	    public void rediff() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		WebElement signinLink = driver.findElement(By.className("signin"));
		   System.out.println(signinLink.getTagName());
		   
		   WebElement allLinks = driver.findElement(By.tagName("a"));
		   System.out.println("Total Links in this webpage with tagname a are: "  + allLinks.getSize());
		   
		   WebElement allDivLinks = driver.findElement(By.tagName("div"));
		   System.out.println("Total Links in this webpage with tagname div are: "  + allDivLinks.getSize());
		   
		   WebElement allInputLinks = driver.findElement(By.tagName("input"));
		   System.out.println("Total Links in this webpage with tagname input are: "  + allInputLinks.getSize());
		
		
		

}
}