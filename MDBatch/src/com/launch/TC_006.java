package com.launch;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;

public class TC_006 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		test=report.startTest("TC_006");
		
		init();
		test.log(LogStatus.INFO, "Initilizing the properties files.....");
		
		browserLaunch("chromebrowser");
		test.log(LogStatus.INFO, "Opened the browser : - " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.INFO, "Navigated to url :- " + subProp.getProperty("amazonurl"));

		String actualLink = driver.findElement(By.xpath("//a[contains(text(),'Customer Service')]")).getAttribute("innerHTML");
		String expectedlink="Customer Serv";
		
		//Assert.assertEquals(actualLink, expectedlink);
		//Assert.assertTrue(actualLink.equals(expectedlink));
		
		SoftAssert s=new SoftAssert();
		//s.assertEquals(actualLink, expectedlink);
		
		s.assertTrue(actualLink.equals(expectedlink),"error0");
		
		s.assertTrue(false, "error1");
		
		s.assertTrue(true, "error2");
		
		s.assertTrue(false, "error3");
		
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Customer Service')]")).click();
		
		s.assertAll();
		
		report.endTest(test);
		report.flush();

	}

}
