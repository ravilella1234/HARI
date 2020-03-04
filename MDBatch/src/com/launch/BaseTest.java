package com.launch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	public static WebDriver driver;
	public static FileInputStream fis;
	public static Properties p;
	
	public static void init() throws Exception
	{
		fis=new FileInputStream("D:\\Feb-2020 Working Directory\\MDBatch\\data.properties");
		p=new Properties();
		p.load(fis);
	}
	
	public static void browserLaunch(String browser)
	{
		if(p.getProperty(browser).equals("chrome")) {
			driver=new ChromeDriver();
		}else if(p.getProperty(browser).equals("firefox")) {
			driver=new FirefoxDriver();
		}	
	}
	
	
	public static void navigateUrl(String url)
	{
		driver.get(p.getProperty(url));
	}
	

}
