package testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class Session extends BaseTest
{
	
  @Test
  public void doLogin() 
  {
	 // System.out.println("doLogin");
	  test.log(Status.INFO, "doLogin");
	  app.openBrowser("chromebrowser");
	  app.navigateUrl("rediffurl");
	  app.clickElement("signin_linktext");
	  app.typeText("useremail_id", "rediffuser");
	  app.typeText("userpassword_id", "rediffpassword");
	  app.clickElement("loginsubmit_id");
  }
  
  @Test
  public void doLogout() 
  {
	  test.log(Status.INFO, "doLogout");
	 // System.out.println("doLogout");
  }
  
}
