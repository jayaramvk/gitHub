package mavn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoA {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
	}
	
	@Test public void testA() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();
	}
}
