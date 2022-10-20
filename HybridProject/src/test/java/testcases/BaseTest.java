package testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest 
{
	@BeforeTest
	public void init()
	{
		System.out.println("beforeMethod");
	}
	
	@AfterTest
	public void kill()
	{
		System.out.println("afterMethod");
	}

}
