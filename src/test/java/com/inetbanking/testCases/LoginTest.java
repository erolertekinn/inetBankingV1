package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPageModel;


public class LoginTest extends BaseTest{
	
	@Test
	public void loginTest() throws IOException {
		driver.get(baseUrl);
		logger.info("Url is Opened");
		LoginPageModel lp = new LoginPageModel(driver);

		lp.setUserName(userID);
		logger.info("Entered Username");
		
		/*
		logger.trace("Logger message TRACE");
		logger.debug("Logger message DEBUG");
		logger.info("Logger message INFO");
		logger.warn("Logger message WARM");
		logger.error("Logger message ERROR");
		logger.fatal("Logger message FATAL");
		*/
		
		lp.setPassword(password);
		logger.info("Entered Password");
		lp.clickSubmit();
		logger.info("Clicked to the submit button");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else {
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
	}

}
