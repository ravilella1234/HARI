package com.launch;

import org.apache.log4j.Logger;

import com.relevantcodes.extentreports.LogStatus;

public class TC_003 extends BaseTest
{

	private static final Logger log=Logger.getLogger(TC_003.class);
	
	public static void main(String[] args) throws Exception 
	{
		test=report.startTest("TC_003");
		
		init();
		log.info("Initilizing the properties files.....");
		test.log(LogStatus.INFO, "Initilizing the properties files.....");
		
		browserLaunch("chromebrowser");
		log.info("Opened the browser : - " + p.getProperty("chromebrowser"));
		test.log(LogStatus.INFO, "Opened the browser : - " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("Navigated to url :- " + subProp.getProperty("amazonurl"));
		test.log(LogStatus.INFO, "Navigated to url :- " + subProp.getProperty("amazonurl"));
		
		selectOption("amazondropbox_id","dropvalue");
		log.info("Selected the option :- " + mainProp.getProperty("dropvalue") + " by using locator :- " + mainProp.getProperty("amazondropbox_id"));
		test.log(LogStatus.INFO, "Selected the option :- " + mainProp.getProperty("dropvalue") + " by using locator :- " + mainProp.getProperty("amazondropbox_id"));
		
		type("amazonsearchtext_name","textvalue");
		log.info("Entered the text :- " + mainProp.getProperty("textvalue") + " By using the locator :- " + mainProp.getProperty("amazonsearchtext_name"));
		test.log(LogStatus.INFO, "Entered the text :- " + mainProp.getProperty("textvalue") + " By using the locator :- " + mainProp.getProperty("amazonsearchtext_name"));
		
		clickElement("amazonsearchbutton_xpath");
		log.info("Clicked on element by using locator :- " + mainProp.getProperty("amazonsearchbutton_xpath"));
		test.log(LogStatus.PASS, "Clicked on element by using locator :- " + mainProp.getProperty("amazonsearchbutton_xpath"));
		
		
		report.endTest(test);
		report.flush();
		
		//WebElement drop = driver.findElement(By.id("searchDropdownBox"));
		//drop.sendKeys("Books");
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
		
		//driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
		
		
	}

	

}
