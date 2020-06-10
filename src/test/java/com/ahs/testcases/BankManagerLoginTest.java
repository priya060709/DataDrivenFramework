package com.ahs.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import com.ahs.base.testbase;

public class BankManagerLoginTest extends testbase {

	
	@Test
	public void bankManagerLoginTest() throws InterruptedException, IOException{
		
		
		//verifyEquals("abc", "xyz");
		Thread.sleep(3000);
		log.debug("Inside Login Test");
		log.debug("before click initiated");
		click("bmlBtn_CSS");
		//log.debug("Manager button "+ OR.getProperty("bmlBtn_CSS"));
		//log.debug("Config property "+ config.getProperty("browser"));
		//locator ="bmlBtn_CSS";
		//driver.findElement(By.cssSelector("button[ng-click='manager()']")).click();
		Thread.sleep(6000);
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn_CSS"))),"Login not successful");
		
		log.debug("Login successfully executed");
		
		//Assert.fail("Login not successful");	
	
	}
	
}
