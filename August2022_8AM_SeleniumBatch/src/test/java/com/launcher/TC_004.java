package com.launcher;

import com.aventstack.extentreports.Status;

public class TC_004 extends BaseTest
{
	
	
	public static void main(String[] args) throws Exception 
	{
		
		init();
		test = report.createTest("TC_004");
		test.log(Status.INFO, "Init the Properties files...");
				
		launch("chromebrowser");
		test.log(Status.PASS, "Opening the Browser :" + p.getProperty("chromebrowser"));
				
		navigateUrl("amazonurl");
		test.log(Status.INFO, "Navigating to url : " + childProp.getProperty("amazonurl"));
		
		selectOption("amazondropbox_id","Books");
		test.log(Status.PASS, "Selecting the option Books By using locator : " + orProp.getProperty("amazondropbox_id"));
		
		typeText("amazonsearchtextbox_name","Harry Potter");
		test.log(Status.INFO, "Entering the text Harry Potter By using locator : " + orProp.getProperty("amazonsearchtextbox_name"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(Status.FAIL, "Clicked on element by using locator : " +  orProp.getProperty("amazonsearchbutton_xpath"));
			
		report.flush();
	}
}
