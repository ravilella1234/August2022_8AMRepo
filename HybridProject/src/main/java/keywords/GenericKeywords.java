package keywords;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericKeywords 
{
	public String projectPath = System.getProperty("user.dir");
	public FileInputStream fis;
	public Properties mainprop;
	public Properties childProp;
	public WebDriver driver;
	public ExtentTest test;
	
	public void openBrowser(String browserName)
	{
		test.log(Status.INFO, "Opening th Browser :" + mainprop.getProperty(browserName));
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
		test.log(Status.INFO, "Naviating to url "+ childProp.getProperty(url));
		driver.get(childProp.getProperty(url));
	}
	
	public void clickElement(String locatorKey)
	{
		getElement(locatorKey).click();
	}
	
	public void typeText(String locatorKey, String textKey)
	{
		getElement(locatorKey).sendKeys(childProp.getProperty(textKey));
	}
	
	public void selectOption(String locatorKey,String optionKey)
	{
		getElement(locatorKey).sendKeys(childProp.getProperty(optionKey));		
	}
	
	public String getText()
	{
		return null;
		
	}

	public  WebElement getElement(String locatorKey) 
	{
		WebElement element = null;
		
		//check for Element Present
		if(!isElementPresent(locatorKey))
			//report as failure
			System.out.println("Element is not Present : " + locatorKey);
		
		element = driver.findElement(getLocator(locatorKey));
		return element;
	}

	public  boolean isElementPresent(String locatorKey) 
	{
		System.out.println("Checking for Element Presence: "+  locatorKey);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(getLocator(locatorKey)));	
		return true;
	}
	
	public  By getLocator(String locatorKey)
	{
		By by = null;
		
		if(locatorKey.endsWith("_id")) {
			by = By.id(mainprop.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_name")) {
			by = By.name(mainprop.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_classname")) {
			by = By.className(mainprop.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_xpath")) {
			by = By.xpath(mainprop.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_css")) {
			by = By.cssSelector(mainprop.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_linktext")) {
			by = By.linkText(mainprop.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_partiallinktext")) {
			by = By.partialLinkText(mainprop.getProperty(locatorKey));
		}
		
		return by;
	}
	
	
	
}
