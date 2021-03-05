package com.nt.test;

import com.nt.comp.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StratgyDPTest {

	public static void main(String[] args) {
		
		Flipkart fpkt=null;
		fpkt=FlipkartFactory.getInstance("First Flight");
		
		System.out.println(fpkt.shoping(new String[] {"Pakora","Jelebi","Tea"}, new float[] {1000.0f,2000.0f,500.0f}));
		
	}

}
