package com.launcher;

import org.apache.log4j.Logger;

public class TC_003 extends BaseTest
{
	private static final Logger log = Logger.getLogger(TC_003.class);
	
	public static void main(String[] args) throws Exception 
	{
		
		init();
		log.info("Init the Properties files...");
		
		launch("chromebrowser");
		log.info("Opening the Browser :" + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("Navigating to url : " + childProp.getProperty("amazonurl"));
		
		selectOption("amazondropbox_id","Books");
		log.info("Selecting the option Books By using locator : " + orProp.getProperty("amazondropbox_id"));
		
		typeText("amazonsearchtextbox_name","Harry Potter");
		log.info("Entering the text Harry Potter By using locator : " + orProp.getProperty("amazonsearchtextbox_name"));
		
		clickElement("amazonsearchbutton_xpath");
		log.info("Clicked on element by using locator : " +  orProp.getProperty("amazonsearchbutton_xpath"));
			
		
		//WebElement loc = driver.findElement(By.id("searchDropdownBox"));
		//loc.sendKeys("Books");
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		//driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		//driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	}
}
