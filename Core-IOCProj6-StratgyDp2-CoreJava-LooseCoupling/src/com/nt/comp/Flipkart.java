package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	
	private Courier courier;
	
	public void setCourier(Courier courier) {
		this.courier=courier;
	}
	
	public String shopping(String[] items, float[] prices) {
		float bAmt= 0;
		int oId=0;
		String msg = null;
		
		for(float p : prices) 
			bAmt += p;
		
		oId= new Random().nextInt(10000);
		msg = courier.deliver(oId);
		
		return Arrays.toString(items)+" has purchesed having prices "+Arrays.toString(prices)+" total bill amount "+ bAmt+ "---"+msg;
		
	}

}
