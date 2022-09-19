package testcases;

import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PaymentManager 
{
	
  @Test
  public void applyDiscount() 
  {
	  System.out.println("------------  applyDiscount  ----------");
  }	
	
  @Test
  @Parameters({"action"})
  public void makePayment(String parameterType, ITestContext context) 
  {
	  if(parameterType.equals("pay@Hotel"))
		  System.out.println("makePayment @Hotel");
	  else
	  	  System.out.println("makePayment @Online");
	  
	  // Booking ID
	  String bookingID = "RRR1234"; 
	  System.out.println("BID : " + bookingID);
	  context.setAttribute("bID", bookingID);
  }
 
}
