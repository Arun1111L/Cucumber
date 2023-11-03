package com.bddframework.Parabank;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class Utility_Class {
	String strFirstName,strLastName,strAddress,strCity,strState,strZipCode,strPhone,strSSN,strUsername,strPassword,strConfirm,url;
	File file = new File("C:\\Users\\alakshmanan\\eclipse-workspace\\Parabank\\src\\test\\resources\\Bank\\Register_Login.properties");
	public Utility_Class() {
		Para_data();
	}
	public void Para_data() {
	FileInputStream input = null;
	try {
		 input = new FileInputStream(file);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
  Properties property = new Properties();
	try {
		property.load(input);
	} catch(IOException e) {
		e.printStackTrace();
	}
   strFirstName = property.getProperty("FirstName");
   strLastName = property.getProperty("LastName");
   strAddress = property.getProperty("Address");
   strCity = property.getProperty("City");
   strState = property.getProperty("State");
   strZipCode = property.getProperty("ZipCode");
   strPhone = property.getProperty("Phone");
   strSSN = property.getProperty("SSN");
   strUsername = property.getProperty("Username");
   strPassword = property.getProperty("Password");
   strConfirm = property.getProperty("Confirm");
   url = property.getProperty("url");  
}
	}

