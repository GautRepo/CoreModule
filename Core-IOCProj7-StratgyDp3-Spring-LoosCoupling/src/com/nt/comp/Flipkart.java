package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {

	// initializing the dependency
	private Courier courier;

	public Flipkart() {
	}

	// constructor injection
	public Flipkart(Courier courier) {

		System.out.println("Flipkart:: 1-parm counstructor ");
		this.courier = courier;
	}

	public void setCourier(Courier courier) {
		this.courier = courier;
	}

	// setting business method
	public String shopping(String[] items, float[] prices) {

		float bAmt = 0.0f;
		int rand = 0;
		String msg = null;
		for (float p : prices)
			bAmt += p;
		rand = new Random().nextInt(10000);

		msg = courier.deliver(rand);

		return Arrays.toString(items) + " having respective price are " + Arrays.toString(prices) + " total prices are "
				+ bAmt + "---" + msg;
	}

}
