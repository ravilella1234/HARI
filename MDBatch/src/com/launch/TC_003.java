package com.launch;

public class TC_003 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		
		init();
		
		browserLaunch("chromebrowser");
		
		navigateUrl("amazonurl");
		
		selectOption("amazondropbox_id","Books");
		
		type("amazonsearchtext_name","Harry Potter");
		
		clickElement("amazonsearchbutton_xpath");
		
		
		//WebElement drop = driver.findElement(By.id("searchDropdownBox"));
		//drop.sendKeys("Books");
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
		
		//driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
		
		
	}

	

}
