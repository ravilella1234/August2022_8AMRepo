package keywords;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import com.aventstack.extentreports.ExtentTest;

public class ApplicationKeywords extends ValidationKeywords
{
	
	public ApplicationKeywords() throws Exception 
	{
		mainprop = new Properties();
		childProp = new Properties();
			
		try 
		{
			fis = new FileInputStream(projectPath+"//src//test//resources//environment.properties");
			mainprop.load(fis);;
			String e = mainprop.getProperty("env");
			
			fis = new FileInputStream(projectPath+"//src//test//resources//"+e+".properties");
			childProp.load(fis);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}

	public void login()
	{
		
	}
	
	public void selectDateFormCalander()
	{
		
	}
	
	public void setReport(ExtentTest test)
	{
		this.test = test;
	}

}
