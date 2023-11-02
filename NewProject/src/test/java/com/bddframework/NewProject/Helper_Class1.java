package com.bddframework.NewProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper_Class1 {
private static Helper_Class1 helperclass;
	
	private static WebDriver driver;
	//private static WebDriverWait wait;
	public final static int TIMEOUT = 10;
	
	Helper_Class1(){
		driver = new EdgeDriver();
	//	wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
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
			helperclass = new Helper_Class1();
		}
	}
	
	public static void tearDown() {
		if(driver!=null) {
			driver.close();
			driver.quit();
		}
		
		helperclass = null;
	}
}
