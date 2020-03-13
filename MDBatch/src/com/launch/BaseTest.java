package com.launch;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseTest 
{
	public static WebDriver driver;
	public static FileInputStream fis;
	public static Properties p;
	public static Properties mainProp;
	public static Properties subProp;
	public static String projectPath=System.getProperty("user.dir");
	
	public static ExtentReports report = ExtentManager.getInstance();
	public static ExtentTest test;
	
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
		
		fis=new FileInputStream(projectPath+"\\log4jconfig.properties");
		PropertyConfigurator.configure(fis);
		

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
		getElement(locatorKey).sendKeys(mainProp.getProperty(value));
	}

	public static void selectOption(String locatorKey, String option) 
	{
		//driver.findElement(By.id(mainProp.getProperty(locatorKey))).sendKeys(option);
		getElement(locatorKey).sendKeys(mainProp.getProperty(option));
	}
	
	//*********************  Verifications  ********************
	
	public static boolean isElementEqual(String expectedlink) 
	{
		String actualLink = driver.findElement(By.xpath("//a[contains(text(),'Customer Service')]")).getAttribute("innerHTML");
		if(actualLink.equals(expectedlink))
			return true;
		else
			return false;
	}
	
	
	//****************  Reportings  &******************************
	
	public static void reportPass(String passMessage) {
		
		test.log(LogStatus.PASS, passMessage);
	}

	public static void reportFail(String failMessage) throws Exception {
		
		test.log(LogStatus.FAIL, failMessage);
		takeScreenshot();
	}

	public static void takeScreenshot() throws Exception 
	{
		Date dt=new Date();
		System.out.println(dt);
		String dateFormat=dt.toString().replace(":", "_").replace(" ", "_")+".png";		
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrFile, new File(projectPath+"\\failurescreenshots\\"+dateFormat));
		
		test.log(LogStatus.INFO, "Screenshot --->" +test.addScreenCapture(projectPath+"\\failurescreenshots\\"+dateFormat));
	}
	
}
