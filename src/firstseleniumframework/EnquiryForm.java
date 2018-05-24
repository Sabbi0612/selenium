package firstseleniumframework;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class EnquiryForm {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "../selenium/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		// Get the URl of the Web Site
		String WebUrl = "http://toolsqa.com/automation-practice-form/";
		driver.get(WebUrl);
		
		// Comparing the Page Title to the Expected Title
		String actualTitle = driver.getTitle();
		String expectedTitle = "Demo Form for practicing Selenium Automation"; 
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("The Title matches the expected outcome");
			System.out.println(actualTitle);
		} else {
			System.out.println("Title doesn't match the expected outcome");
			driver.quit();
		}	
		
		// To see if the FormTitle is visible to the User or Not"
		WebElement formTitle = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div/div[1]/div/div/div/div[2]/div/h1"));
		String a = formTitle.getText();
		System.out.println("The form title is :" + a);
		Assert.assertEquals(true, formTitle.isDisplayed());
		
		// Click on Partial Link Test
		WebElement partialLink = driver.findElement(By.partialLinkText("Partial Link Test"));
		String b = partialLink.getText();
		System.out.println("Partial Link Title is: " + b);
		
		// Click a Link and open in New Tab
		// String linkTest = "http://toolsqa.wpengine.com/automation-practice-table/";
		// String selectLinkOpeninNewTab = Keys.chord(Keys.COMMAND, "t"); 
		// driver.findElement(By.linkText(linkTest)).sendKeys(selectLinkOpeninNewTab);
		
		// Click on the Link Test
		driver.findElement(By.linkText("Link Test")).click();
		// driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
		
		// Navigate back to previous page (Browser back button)
		driver.navigate().back();
		
		// Fill Values in First Name and Last Name
		driver.findElement(By.xpath("//div[@class='control-group']/input[@name='firstname']")).sendKeys("Sabbi");
		driver.findElement(By.xpath("//div[@class='control-group']/input[@name='lastname']")).sendKeys("Kohli");
		
		// Select the Gender of the Person filling up the form = Male
		WebElement genderRadioButton = driver.findElement(By.id("sex-0"));
		genderRadioButton.click();
		
		// Select Years of Experience = 2
		WebElement yearsOfExperience = driver.findElement(By.id("exp-1"));
		yearsOfExperience.click();
		
		// Enter Date in the field
		WebElement dateValue = driver.findElement(By.xpath("//*[@id='datepicker']"));
		dateValue.sendKeys("6th Decemeber 1992");
		
		// Select the current profession
		WebElement profession = driver.findElement(By.id("profession-0"));
		profession.click();
		
		//Upload a file to the Form
		String filePath = System.getProperty("user.dir") + "/images/test.png"; 
		driver.findElement(By.id("photo")).sendKeys(filePath);
		
		// Select check box for the Tool being used
		WebElement toolPreference = driver.findElement(By.xpath("//div[@class='control-group']/input[@id='tool-2']"));
		toolPreference.click();
		
		// Select a value form the drop-down
		Select continentsDropDown = new Select(driver.findElement(By.id("continents")));
		continentsDropDown.selectByVisibleText("South America");
		
		// Multiple select values from a list of Values
		Select multiSelect = new Select(driver.findElement(By.id("selenium_commands")));
		multiSelect.selectByVisibleText("Browser Commands");
		multiSelect.selectByVisibleText("WebElement Commands");
		
		// Click on the Submit button
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	
		// Making the Browser wait for some time (10 Seconds)
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Read the current URL
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);

		// Read the Message being displayed at the top of the page
		WebElement readMessageAtTop = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div/div[1]/div/div/div/div[1]/p[2]"));
		String messageText = readMessageAtTop.getText();
		System.out.println(messageText);
		
		driver.quit();

	}

}
