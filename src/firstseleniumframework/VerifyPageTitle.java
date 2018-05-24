package firstseleniumframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyPageTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "../selenium/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flightcentre.com.au/holidays");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Holiday Packages and Deals | Save with Flight Centre";
	if(actualTitle.equalsIgnoreCase(expectedTitle)) {
		System.out.println("Title Matched");
	    System.out.println(actualTitle);
	}
	else
		System.out.println("Title " + expectedTitle + " Didn't Match");
		driver.close();
		driver.quit();
	}
}


