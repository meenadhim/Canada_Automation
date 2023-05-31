package automation_code_extra_topics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ZoomInZoomOut {
	
	public WebDriver driver;
	
	@Test
	public void zoomInAndOut() throws Exception   {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://rediff.com");
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 
		 Thread.sleep(2000);
		 //zoom in
		 js.executeScript("document.body.style.zoom =  '400%'   ;");
		 
		 
		 Thread.sleep(3000);
		 //zoom out
		 js.executeScript("document.body.style.zoom =  '40%'   ;");
		 
		 
		 
		 Thread.sleep(3000);
		 //default view
		 js.executeScript("document.body.style.zoom =  '100%'   ;");
		 
	}

}
