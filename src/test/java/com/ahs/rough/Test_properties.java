package com.ahs.rough;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test_properties {

	public static void main(String[] args) throws IOException {
		System.out.println(System.getProperty("user.dir"));
		Properties config = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\resources\\properties\\config.properties");
		config.load(fis);
		System.out.println(config.getProperty("browser"));
		
		Properties OR = new Properties();
		 fis = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\resources\\properties\\OR .properties");
		 OR.load(fis);
		 System.out.println(OR.getProperty("Manager_login"));
		 //driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/div[2]/button")).Click();
	
	
	
	}

}
