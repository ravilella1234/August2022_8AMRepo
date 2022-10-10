package pom;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.launcher.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class POM_001 extends BaseTest
{
	
  @BeforeMethod
  @Parameters("browser")
  public void beforeMethod(String bType) throws Exception 
  {
	    init();
		test = report.createTest("POM_001");
		test.log(Status.INFO, "Init the Properties files...");
				
		launch(bType);
		test.log(Status.PASS, "Opening the Browser :" + p.getProperty("chromebrowser"));
				
		navigateUrl("automationurl");
		test.log(Status.INFO, "Navigating to url : " + childProp.getProperty("automationurl"));
  }
  
  @Test
  public void login() 
  {
	  LoginPage page = new LoginPage(driver);
	  page.customerLogin();
	  Assert.assertEquals(page.verifyLoginError(), "Authentication failed.");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  
  }

}
