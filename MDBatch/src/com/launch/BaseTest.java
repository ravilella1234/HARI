package com.launch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class BaseTest 
{
	public static WebDriver driver;
	public static FileInputStream fis;
	public static Properties p;
	public static Properties mainProp;
	public static Properties subProp;
	public static String projectPath=System.getProperty("user.dir");
	
	public static void init() throws Exception
	{
		System.out.println(projectPath);
		fis=new FileInputStream(projectPath+"\\data.properties");
		p=new Properties();
		p.load(fis);
		
		fis=new FileInputStream(projectPath+"\\environment.properties");
		mainProp=new Properties();
		mainProp.load(fis);
		String e = mainProp.getProperty("env");
		System.out.println(e);
		
		fis=new FileInputStream(projectPath+"\\"+e+".properties");
		subProp=new Properties();
		subProp.load(fis);
		String val = subProp.getProperty("amazonurl");
		System.out.println(val);
	}
	
	public static void browserLaunch(String browser)
	{
		if(p.getProperty(browser).equals("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\drive\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
			
			ChromeOptions option=new ChromeOptions();
			option.addArguments("user-data-dir=C:\\Users\\DELL\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 4");
			option.addArguments("--disable-notifications");
			
			driver=new ChromeDriver(option);
		}else if(p.getProperty(browser).equals("firefox")) {
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\drive\\geckodriver.exe");
			System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver.exe");
			
			ProfilesIni p=new ProfilesIni();
			FirefoxProfile profile = p.getProfile("mdprofile");
			profile.setPreference("dom.webnotifications.enabled", false);
			
			FirefoxOptions option=new FirefoxOptions();
			option.setProfile(profile);
			
			driver=new FirefoxDriver(option);
		}	
	}
	
	
	public static void navigateUrl(String url)
	{
		//driver.get(subProp.getProperty(url));
		driver.navigate().to(subProp.getProperty(url));
		
	}
	
	
	public static void clickElement(String locatorKey) 
	{
		//driver.findElement(By.xpath(mainProp.getProperty(locatorKey))).click();
		getElement(locatorKey).click();
	}

	public static WebElement getElement(String locatorKey) 
	{
		WebElement element=null;
		
		if(locatorKey.endsWith("_id")) {
			element=driver.findElement(By.id(mainProp.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_name")) {
			element=driver.findElement(By.name(mainProp.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_name")) {
			element=driver.findElement(By.name(mainProp.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_classname")) {
			element=driver.findElement(By.className(mainProp.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_xpath")) {
			element=driver.findElement(By.xpath(mainProp.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_css")) {
			element=driver.findElement(By.cssSelector(mainProp.getProperty(locatorKey)));
		}
		
		
		return element;
		
	}

	public static void type(String locatorKey, String value) 
	{
		//driver.findElement(By.name(mainProp.getProperty(locatorKey))).sendKeys(value);
		getElement(locatorKey).sendKeys(value);
	}

	public static void selectOption(String locatorKey, String option) 
	{
		//driver.findElement(By.id(mainProp.getProperty(locatorKey))).sendKeys(option);
		getElement(locatorKey).sendKeys(option);
	}
	

}
