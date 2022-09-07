package verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify1 
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
		
		//if(actualLink.equals(expectedLink))
		//if(actualLink.equalsIgnoreCase(expectedLink))
		if(actualLink.contains(expectedLink))
			System.out.println("Both links are equal...");
		else
			System.out.println("Both links are not equal...");
		
		//String actualLink2 = driver.findElement(By.linkText("Customer Service")).getAttribute("innerHTML");
		//System.out.println(actualLink2);
	}

}
