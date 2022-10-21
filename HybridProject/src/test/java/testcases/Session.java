package testcases;

import org.testng.annotations.Test;

public class Session extends BaseTest
{
	
  @Test
  public void doLogin() 
  {
	  System.out.println("doLogin");
	  app.openBrowser("chromebrowser");
	  app.navigateUrl("rediffurl");
	  //app.clickElement("signin_linktext");
	  //app.typeText("useremail_id", "rediffuser");
	 // app.typeText("userpassword_id", "rediffpassword");
	 // app.clickElement("loginsubmit_id");
  }
  
  @Test
  public void doLogout() 
  {
	  System.out.println("doLogout");
  }
  
}
