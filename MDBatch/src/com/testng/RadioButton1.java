package com.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.launch.BaseTest;

public class RadioButton1 extends BaseTest 
{

	
	@BeforeMethod(groups = {"regression","smoke"})
	@Parameters("browser")
	  public void beforeMethod(String bType) throws Exception 
	  {
		init();
		browserLaunch(bType);
		navigateUrl("radiobuttonurl");
	  }
	
	
	@Test(groups = {"regression","smoke"})
	public void RadioButtonTest() throws Exception
	{
		Thread.sleep(2000);
		WebElement radio=driver.findElement(By.xpath("(//td[@class='table5'])[2]"));
		List<WebElement> rbutton=radio.findElements(By.name("group2"));
		for(int i=0;i<rbutton.size();i++)
		{
			System.out.println(rbutton.get(i).getAttribute("value")+ "----" + rbutton.get(i).getAttribute("checked"));
		}
	}
 

  @AfterMethod(groups = {"regression","smoke"})
  public void afterMethod() 
  {
	  driver.quit();
  }
	
}
