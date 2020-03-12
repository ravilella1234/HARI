package com.launch;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.LogStatus;

public class ScreenShot extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		test=report.startTest("ScreenShot");
		
		init();
		test.log(LogStatus.INFO, "Initilizing the properties files.....");
		
		browserLaunch("chromebrowser");
		test.log(LogStatus.INFO, "Opened the browser : - " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.INFO, "Navigated to url :- " + subProp.getProperty("amazonurl"));

		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:\\Users\\DELL\\Desktop\\abc.png"));
		
		report.endTest(test);
		report.flush();
	}

}
