package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {

	private Courier courier;

	public Flipkart() {
		System.out.println("Flipkart.Flipkart():: 0- parm constructor ");
	}

	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier = courier;
	}

	public String shoping(String[] items, float[] price) {
		float bAmt = 0.0f;
		int oid = 0;
		String msg = null;
		System.out.println("Flipkart.shoping()");

		for (float p : price)
			bAmt += p;
		oid = new Random().nextInt(10000);
		msg = courier.deliver(oid);
		return Arrays.toString(items) + " are purchases having prices " + Arrays.toString(price)
				+ " having total bill amount of " + bAmt + "----" + msg;

	}

}
