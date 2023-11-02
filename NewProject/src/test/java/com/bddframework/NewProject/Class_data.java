package com.bddframework.NewProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Class_data {
	
	String strUsername, strPassword ,url;
	File file = new File("C:\\Users\\alakshmanan\\eclipse-workspace\\NewProject\\src\\test\\resources\\data\\data.properties");
	public Class_data() {
		data();
	}
	public void data() {
		
	
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
	
   strUsername = property.getProperty("username");
	strPassword = property.getProperty("password");
	url = property.getProperty("url");
}
}