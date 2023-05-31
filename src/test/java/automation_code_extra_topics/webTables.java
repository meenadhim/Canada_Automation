package automation_code_extra_topics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class webTables {

	public WebDriver driver;

	@Test
	public void rediffWebTable() {
		String companyName = "Hubtown";
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");

		// I want print all the names of the companies
		// I want to print their respective prices

		List<WebElement> companies = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[1]"));
		List<WebElement> currentPrices = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[4]"));

		System.out.println(
				companies.size() + "------------------------------------------------->" + currentPrices.size());

		// Print all the companies along with their current prices
		// print a specific company name and it's corresponding current price

		for (int i = 0; i < companies.size(); i++) {
			if (companyName.equals(companies.get(i).getText())) {
				System.out.println(
						companies.get(i).getText() + "----------------------------->" + currentPrices.get(i).getText());
			}
		}

	}

	public WebDriver driver1;

	@Test
	public void dataTable() {
		String personName = "Bruno Nash";
		driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://datatables.net/");
		
		List<WebElement> persons = driver1.findElements(By.xpath("//tr[@class = 'odd']/child::td"));         //I want to print all the names on the data table
		List<WebElement> Age = driver1.findElements(By.xpath(" //thead/tr[1]/th[4]"));            //I want to print the ages of all persons    
		
		System.out.println(persons.size() +   "--------------------------------> "  + Age.size());
				 

	}
}                               //The above test case is giving wrong output, check it again