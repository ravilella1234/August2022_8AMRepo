package testcases;

import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import keywords.ApplicationKeywords;
import reports.ExtentManager;

public class BaseTest 
{
	public ApplicationKeywords app;
	public ExtentReports rep;
	public ExtentTest test;
	
	@BeforeTest
	public void init(ITestContext context) throws Exception
	{
		System.out.println("beforeMethod");
		app = new ApplicationKeywords();
		context.setAttribute("app", app);
		
		//init the eReportingfor the Test
		rep = ExtentManager.getInstance();
		test = rep.createTest(context.getCurrentXmlTest().getName());
		test.log(Status.INFO, "Starting the Test : " + context.getCurrentXmlTest().getName());
		app.setReport(test);
		
		context.setAttribute("report", rep);
		context.setAttribute("test", test);
	}
	
	@BeforeMethod
	public void beforeMethod(ITestContext context)
	{
		System.out.println("BeforeMethod");
		app = (ApplicationKeywords)context.getAttribute("app");
		rep = (ExtentReports)context.getAttribute("report");
		test = (ExtentTest)context.getAttribute("test");
	}
	
	@AfterTest
	public void kill()
	{
		System.out.println("afterMethod");
		if(rep!=null)
			rep.flush();
	}

}
