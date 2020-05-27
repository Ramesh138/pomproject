package com.pomproject.testcases;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pomproject.basedriver.Basedriver;
import com.pomproject.flows.Flow_login;

import Utils.Propertyfile;

public class Testcase1 extends Basedriver {   
	    
	@BeforeTest
	public void launchurl() throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		System.out.println("Starting the suite");
		driver.get(Propertyfile.prop("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		System.out.println("Launching the URL");
	}
	
	@Test
	public void tc1() throws IOException {
		Flow_login fl= new Flow_login(driver);
		
		fl.login(Propertyfile.prop("username"), Propertyfile.prop("password"));
	}
	
	
	@AfterTest
	public void closethebrowser() {
		driver.quit();
	}
	
	

}
