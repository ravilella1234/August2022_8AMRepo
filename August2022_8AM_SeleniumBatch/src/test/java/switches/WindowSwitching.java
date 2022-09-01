package switches;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowSwitching 
{
	static WebDriver driver ;
	
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String parentWindowId = driver.getWindowHandle();
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
		
		Set<String> handles = driver.getWindowHandles();
		List<String> hList = new ArrayList<String>(handles);
		
		//switch to right window
		if(switchToRightWindow("LinkedIn",hList)) {
			System.out.println(driver.getCurrentUrl() +" : " + driver.getTitle());
		}
		
		//close all the child windows except parent window
		closeAllWindows(hList, parentWindowId);

		//switch back to Parent Window
		switchToParentWindow(parentWindowId);
		System.out.println(driver.getCurrentUrl() +" : " + driver.getTitle());
			
	}
	
	
	public static void closeAllWindows(List<String> hList,String parentWindowId)
	{
		for(String e :hList) {
			if(!e.equals(parentWindowId)) {
				driver.switchTo().window(e).close();
			}
		}
	}
	
	public static void switchToParentWindow(String parentWindowId)
	{
		driver.switchTo().window(parentWindowId);
	}
	
	public static boolean switchToRightWindow(String windowTitle,List<String> hList)
	{
		for(String e:hList)
		{
			String title = driver.switchTo().window(e).getTitle();
			if(title.contains(windowTitle))
			{
				System.out.println("found the right window....");
				return true;
			}
		}
		return false;
	}

}
