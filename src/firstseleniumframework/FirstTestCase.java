package firstseleniumframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "../selenium/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flightcentre.com.au/");
        System.out.println("Successfully opened the website www.flightcentre.com.au");
		driver.quit();
	}
}
