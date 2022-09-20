package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssertDemo 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		String actualLink = driver.findElement(By.linkText("Customer Service")).getText();
		System.out.println(actualLink);
		
		String expectedLink = "Customer Serv";
		System.out.println(expectedLink);
		
		//Hard Assert
		//Assert.assertEquals(actualLink, expectedLink);
		Assert.assertTrue(actualLink.equals(expectedLink), "Both liks are not equal...");
		
	
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sony");
	}

}
