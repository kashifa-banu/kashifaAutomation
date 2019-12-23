package com.demaout.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.ResourceBundle.Control;

public class Utility {
	
	public static String fetchApplicationProperty(String key) {

		String value = null;
		try {
		FileInputStream file=new FileInputStream("./Resources/application.properties");
		Properties prop=new Properties();
		prop.load(file);
		value=prop.getProperty(key);		
		}
		catch(Exception e) {
			
		}
		
		return value;
	}

	public static String fetchApplicationDataProperty(String key) {

		String value = null;
		try {
		FileInputStream file=new FileInputStream("./Resources/application_data.properties");
		Properties prop=new Properties();
		prop.load(file);
		value=prop.getProperty(key);		
		}
		catch(Exception e) {
			
		}
		
		return value;
	}

	public static String fetchApplicationElementProperty(String key) {

		String value = null;
		try {
		FileInputStream file=new FileInputStream("./Resources/application_element.properties");
		Properties prop=new Properties();
		prop.load(file);
		value=prop.getProperty(key);		
		}
		catch(Exception e) {
			
		}
		
		return value;
	}


}
