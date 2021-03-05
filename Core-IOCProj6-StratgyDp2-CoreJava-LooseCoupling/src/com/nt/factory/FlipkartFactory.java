package com.nt.factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.nt.comp.Courier;
import com.nt.comp.Flipkart;

public class FlipkartFactory {

	private static Properties prop;
	static {
		try {
			// LOCATE THE property file
			InputStream in = new FileInputStream("src/com/nt/commons/info.properties");

			// load the property file
			prop = new Properties();

			prop.load(in);
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		
	}
	public static Flipkart getInstance() throws Exception{
		Courier courier = null;
		Flipkart flipkart;
		
	//	load property file at run time 
		courier = (Courier)Class.forName(prop.getProperty("spd.dependent")).newInstance();
		
		flipkart = new Flipkart();
		flipkart.setCourier(courier);
		
		return flipkart;
	}

}
