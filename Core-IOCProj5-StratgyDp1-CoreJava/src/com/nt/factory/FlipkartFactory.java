package com.nt.factory;

import com.nt.comp.BlueDartCourier;
import com.nt.comp.Courier;
import com.nt.comp.DTDCCourier;
import com.nt.comp.FirstFlight;
import com.nt.comp.Flipkart;

public class FlipkartFactory {
	
	public static Flipkart getInstance(String courierName) {
		Courier courier;
		Flipkart fpkt;
		System.out.println("FlipkartFactory.getInstance()");
		
		if(courierName.equalsIgnoreCase("DTDC"))
			courier= new DTDCCourier();
		else if (courierName.equalsIgnoreCase("First Flight"))
			courier= new FirstFlight();
		else if(courierName.equalsIgnoreCase("Blue Dart"))
			courier= new BlueDartCourier();
		else
			throw new IllegalArgumentException("Invalid Courier Name");
		fpkt = new Flipkart();
		fpkt.setCourier(courier);
		
		return fpkt;
		
		
	}

}
