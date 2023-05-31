package automation_code_extra_topics;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GetTextMethod {

	public static WebDriver driver;
	public static ChromeOptions options;
	public static SoftAssert softassert;

	@Test
	public void wrongPasswordLogin() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("--start-maximized");
		options.addArguments("incognito");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));

		driver = new ChromeDriver(options);
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.xpath("//div[@id = 'top-links']/descendant::li[2]/child::a[1]")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@1234");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

		String actualWarningMessage = driver.findElement(By.xpath("//div[contains@class, 'alert-dismissible')]")).getText();
		System.out.println("Actual Warning Message is: "    + actualWarningMessage);

		String expectedWarningMessage = "Warning: No match for E-mail Address and/or Password.";
		System.out.println("Expected Warning Message is: "  + expectedWarningMessage);

		softassert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
		softassert.assertAll();

	}

}
