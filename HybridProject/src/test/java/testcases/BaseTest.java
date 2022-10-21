package testcases;

import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import keywords.ApplicationKeywords;

public class BaseTest 
{
	public ApplicationKeywords app;
	
	@BeforeTest
	public void init(ITestContext context) throws Exception
	{
		System.out.println("beforeMethod");
		app = new ApplicationKeywords();
		context.setAttribute("app", app);
	}
	
	@BeforeMethod
	public void beforeMethod(ITestContext context)
	{
		System.out.println("BeforeMethod");
		app = (ApplicationKeywords)context.getAttribute("app");
		
	}
	
	@AfterTest
	public void kill()
	{
		System.out.println("afterMethod");
	}

}
