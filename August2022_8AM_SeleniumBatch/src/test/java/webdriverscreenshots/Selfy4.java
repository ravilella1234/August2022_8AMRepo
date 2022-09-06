package webdriverscreenshots;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selfy4 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		for(int i=0;i<links.size();i++)
		{
			String linkName = links.get(i).getText();
			
			Date dt = new Date();
			System.out.println(dt);
			String str = dt.toString().replace(':', '_').replace(' ', '_');
			
			links.get(i).click();
			
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(scrFile, new File("C:\\Users\\ravi\\Desktop\\Screenshots\\"+linkName+"_"+str+".png"));

			links = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		}
	}

}
