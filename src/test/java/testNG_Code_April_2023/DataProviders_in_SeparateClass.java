package testNG_Code_April_2023;

import org.testng.annotations.DataProvider;

public class DataProviders_in_SeparateClass {
	
	@DataProvider(name = "Rediff")
	public static Object[][] getRediffData() {
		Object[][] data = { { "seleniumpanda@rediffmail.com", "Selenium@123" } };

		return data;
	}
	@DataProvider(name = "TN")
	public static Object[][] getTNData() {
		Object[][] data = { { "seleniumpanda@gmail.com", "Selenium@123" }};
				
		
	return data;
		
	}
}