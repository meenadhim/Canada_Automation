package automation_code_extra_topics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class MouseKeyboard {
	
	public WebDriver driver;
	public Actions actions;
	
	@Test 
	public void mouseDraggable() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		//Frames in webpage
		//Total number of frames
		
		List<WebElement>totalFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("total number of frames are:  "   + totalFrames.size());
		
		//Handling the frames
		
		driver.switchTo().frame(0);
		WebElement target = driver.findElement(By.id("draggable"));
		Actions actions = new Actions(driver);
		actions.clickAndHold(target).dragAndDropBy(target, 200 ,300).build().perform();
	}
		
		
		@Test
		public void mouseDroppable() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://jqueryui.com/droppable/");
			
			List<WebElement>totalFrames = driver.findElements(By.tagName("iframe"));
			System.out.println("total number of frames are:  "   + totalFrames.size());
			
			driver.switchTo().frame(0);
			WebElement source = driver.findElement(By.id("draggable"));
			WebElement target = driver.findElement(By.id("droppable"));
			actions = new Actions(driver);
			actions.dragAndDrop(source , target).build().perform();
			
		}
		@Test
		public void rediffMouseOperations()   {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://rediff.com/");
			WebElement signinLink = driver.findElement(By.className("signin"));
			actions  = new Actions(driver);
			actions.moveToElement(signinLink).contextClick().build().perform();
		}
		
		@Test
		public void keyBoardOperations()   {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo");
			driver.findElement(By.linkText("My Account")).click();driver.findElement(By.linkText("Login")).click();
		    driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
			driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
			WebElement loginButton = driver.findElement(By.cssSelector("input.btn.btn-primary"));
			loginButton.sendKeys(Keys.ENTER);
			
		}
			
		
	

}
