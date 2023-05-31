package automation_code_extra_topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToolTip {
	
	
	   public WebDriver driver;
	   
	   @Test
	   public void toolTipValidation()   {
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://rediff.com");
		   
		   WebElement moneyLink = driver.findElement(By.linkText("Money"));
		   String toolTipValMoney = moneyLink.getAttribute("title");
		   System.out.println(toolTipValMoney);
		   
	   }

}
