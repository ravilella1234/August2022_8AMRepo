package testng;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.launcher.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class TNG_004 extends BaseTest
{
	
  @BeforeMethod(groups = {"regression","sanity"})
  @Parameters("browser")
  public void startProcess(String bType) throws Exception 
  {
	    init();
		test = report.createTest("TNG_004");
		test.log(Status.INFO, "Init the Properties files...");
				
		launch(bType);
		test.log(Status.PASS, "Opening the Browser :" + p.getProperty("chromebrowser"));
				
		navigateUrl("amazonurl");
		test.log(Status.INFO, "Navigating to url : " + childProp.getProperty("amazonurl"));
  }
	
  @Test(groups = {"regression","sanity"})
  public void amazon() 
  {
	    selectOption("amazondropbox_id","Books");
		test.log(Status.PASS, "Selecting the option Books By using locator : " + orProp.getProperty("amazondropbox_id"));
		
		typeText("amazonsearchtextbox_name","Harry Potter");
		test.log(Status.INFO, "Entering the text Harry Potter By using locator : " + orProp.getProperty("amazonsearchtextbox_name"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(Status.FAIL, "Clicked on element by using locator : " +  orProp.getProperty("amazonsearchbutton_xpath"));
  }
  
  @AfterMethod(groups = {"regression","sanity"})
  public void endProcess() 
  {
	  report.flush();
	  driver.quit();
  }

}
