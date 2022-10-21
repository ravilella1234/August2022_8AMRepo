package keywords;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericKeywords 
{
	public String projectPath = System.getProperty("user.dir");
	public FileInputStream fis;
	public Properties mainprop;
	public Properties childProp;
	public WebDriver driver;
	
	
	public void openBrowser(String browserName)
	{
		if(mainprop.getProperty(browserName).equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(mainprop.getProperty(browserName).equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
	}
	
	public void navigateUrl(String url)
	{
		driver.get(childProp.getProperty(url));
	}
	
	public void clickElement(String locator)
	{
		
	}
	
	public void typeText(String locator, String text)
	{
		
	}
	
	public void selectOption(String locator,String option)
	{
		
		
	}
	
	public String getText()
	{
		return null;
		
	}

}
