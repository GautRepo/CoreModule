package com.nt.test;

import com.nt.comp.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StratgyDPTest {
	
	public static void main(String[] args) {
		
		Flipkart flipkart=null;
		
		try {
			flipkart= FlipkartFactory.getInstance();
		}catch(Exception exc) {
			exc.printStackTrace();
		}
		System.out.println(flipkart.shopping(new String[] {"Pakora","Tea","Samosa"}, new float[] {15.0f,8.0f,10.0f}));
	}

}
