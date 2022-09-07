package verifications;

import com.aventstack.extentreports.Status;
import com.launcher.BaseTest;

public class Verify3 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		test = report.createTest("Verify3");
		test.log(Status.INFO, "Init the Properties files...");
				
		launch("chromebrowser");
		test.log(Status.PASS, "Opening the Browser :" + p.getProperty("chromebrowser"));
				
		navigateUrl("amazonurl");
		test.log(Status.INFO, "Navigating to url : " + childProp.getProperty("amazonurl"));
					
		String expectedLink = "Customer service";
		if(!isLinksEqual(expectedLink))
			reportFailure("Both links are not equal...");
		else
			reportSuccess("Both links are equal...");
		report.flush();
	}
}
