package firstseleniumframework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintMultipleListItems {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "../selenium/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		List<WebElement> list = driver.findElements(By.xpath("//ul[@id='homefeatured']//li"));
		for(WebElement complist: list) {
			System.out.println(complist.getText());
		}
		driver.quit();
	} 

}
