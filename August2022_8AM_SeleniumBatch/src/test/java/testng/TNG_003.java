package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TNG_003 
{
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("beforeMethod");
  }
  
  @Test
  public void f() 
  {
	  System.out.println("f");
  }
  
  @Test
  public void z() 
  {
	  System.out.println("z");
  }
  
  @Test
  public void a() 
  {
	  System.out.println("a");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("afterMethod");
  }

}
