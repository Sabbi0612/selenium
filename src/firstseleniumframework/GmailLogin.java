package firstseleniumframework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "../selenium/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://accounts.google.com/signin");
		driver.findElement(By.id("identifierId")).sendKeys("practiceautomation0612@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		//driver.findElement(By.xpath("//div[@id='password']//input[@name='password']")).click();
		WebElement lemen = driver.findElement(By.xpath("//div[@id='password']//input[@name='password']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", lemen);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='password']//input[@name='password']")).sendKeys("Srijan@123");
		driver.findElement(By.id("passwordNext")).click();
		driver.quit();
	}
}
