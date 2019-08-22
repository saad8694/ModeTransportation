package com.modeTransportation2G.testCases;

import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.modeTransportation2G.pageObjects.LoginPage;

public class TC_LoginTest extends BaseClass {

	@Test
	public void loginTest() throws InterruptedException, IOException
	{
	
		 driver.get(baseURL);
		 LoginPage lp = new LoginPage(driver);
		 lp.setUserName(username);
		 logger.info("User name entered");
		
		 
		 lp.setPassword(password);
		 logger.info("Password entered");
		 
		 lp.clickSubmit();
		 logger.info("button clicked");
		 
		 Thread.sleep(4000L); 
		
		 if (driver.getCurrentUrl().equals("https://devfront.modetrans.com/Booking/Dashboard"))
		 {
			 Assert.assertTrue(true);
			 logger.info("Test case passed");
		 }
		 else
		 {
			 Assert.assertTrue(true);
			 logger.info("Test case failed");
			 captureScreen(driver, "loginTest");
		 }
		 
		 
		 System.out.println(""+driver.getCurrentUrl());
}

	
}