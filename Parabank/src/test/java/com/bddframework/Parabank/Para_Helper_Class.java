package com.bddframework.Parabank;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Para_Helper_Class {
	private static Para_Helper_Class helperclass;
	private static WebDriver driver;
	public final static int TIMEOUT = 10;
	
	Para_Helper_Class(){
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().window().maximize();
	}
	public static void openPage(String url) {
		driver.get(url);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void setUpDriver() {
		if(helperclass==null) {
			helperclass = new Para_Helper_Class();
		}
	}
	public static void tearDown() {
		if(driver!=null) {
			//driver.close();
			//driver.quit();
		}
		helperclass = null;
	}
}
