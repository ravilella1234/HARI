package com.launch;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.LogStatus;

public class TC_004 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		test=report.startTest("TC_004");
		
		init();
		test.log(LogStatus.INFO, "Initilizing the properties files.....");
		
		browserLaunch("chromebrowser");
		test.log(LogStatus.INFO, "Opened the browser : - " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.INFO, "Navigated to url :- " + subProp.getProperty("amazonurl"));

		String actualLink = driver.findElement(By.xpath("//a[contains(text(),'Customer Service')]")).getAttribute("innerHTML");
		String expectedlink="Customer Ser";
		
		System.out.println("Actual Link :" + actualLink);
		System.out.println("Expected Link :" + expectedlink);
		
		//if(actualLink.equals(expectedlink))
		//if(actualLink.equalsIgnoreCase(expectedlink))
		if(actualLink.contains(expectedlink))
			System.out.println("Both links are equal..");
		else
			System.out.println("Both links are not equal..");
		
		
		WebElement loc = driver.findElement(By.id("twotabsearchtextbox"));
		
		loc.sendKeys("sony");
		String val = loc.getAttribute("value");
		System.out.println("Text is : " + val);
		
		report.endTest(test);
		report.flush();

	}

}
