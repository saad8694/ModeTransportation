package com.modeTransportation2G.testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import utilities.ReadConfig;



public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	
	public String baseURL = readconfig.getApplicationURL();
	public String username = readconfig.getUserName();
	public String password = readconfig.getPassword();
	public static WebDriver driver ;
	
//	public static Logger Logger;
	
	public static Logger logger = org.apache.logging.log4j.LogManager.getLogger(BaseClass.class);
	
	
	@BeforeClass
	@Parameters("browser")
	public void setup(String br) {
		
		if(br.equals("chrome"))
		{
		
		System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
		//System.getProperty("user.dir")+"//Drivers//chromedriver.exe
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
		
		//logger = Logger.getLogger("Mode Tranportation");
		//PropertyConfigurator.configure("Log4j2.properties");
		}
		
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

	public void captureScreen(WebDriver driver, String tname) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File (System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
}
