package com.launch;

import com.relevantcodes.extentreports.LogStatus;

public class TC_005 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		test=report.startTest("TC_005");
		
		init();
		test.log(LogStatus.INFO, "Initilizing the properties files.....");
		
		browserLaunch("chromebrowser");
		test.log(LogStatus.INFO, "Opened the browser : - " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.INFO, "Navigated to url :- " + subProp.getProperty("amazonurl"));

		
		String expectedlink="Customer Servi";

		if(!isElementEqual(expectedlink))
			reportFail("Both links are not equal....");
		else
			reportPass("Both linksa re equal.....");
		
		
		report.endTest(test);
		report.flush();

	}

}
