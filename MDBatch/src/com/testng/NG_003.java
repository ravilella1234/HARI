package com.testng;

import org.testng.annotations.Test;

import com.launch.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NG_003 extends BaseTest
{
	
  @BeforeMethod
  public void startProcess() throws Exception
  {
	  System.out.println("iam beforeMethod");
	  test=report.startTest("NG_003");
		
	  init();
	  test.log(LogStatus.INFO, "Initilizing the properties files.....");
  }
	
	
  @Test
  public void amazonTest() 
  {
	  System.out.println("iam testMethod");
	  	browserLaunch("chromebrowser");
		test.log(LogStatus.INFO, "Opened the browser : - " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.INFO, "Navigated to url :- " + subProp.getProperty("amazonurl"));
		
		selectOption("amazondropbox_id","dropvalue");
		test.log(LogStatus.INFO, "Selected the option :- " + mainProp.getProperty("dropvalue") + " by using locator :- " + mainProp.getProperty("amazondropbox_id"));
		
		type("amazonsearchtext_name","textvalue");
		test.log(LogStatus.INFO, "Entered the text :- " + mainProp.getProperty("textvalue") + " By using the locator :- " + mainProp.getProperty("amazonsearchtext_name"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(LogStatus.PASS, "Clicked on element by using locator :- " + mainProp.getProperty("amazonsearchbutton_xpath"));
  }
  
  
  @AfterMethod
  public void endProcess() 
  {
	  System.out.println("iam afterMethod");
	  report.endTest(test);
	  report.flush();
	  
	  driver.quit();
	  
  }

}
