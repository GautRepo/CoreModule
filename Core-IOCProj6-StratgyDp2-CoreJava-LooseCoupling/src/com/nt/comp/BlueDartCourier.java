package com.nt.comp;

public final class BlueDartCourier implements Courier {
	
	

	public BlueDartCourier() {
		System.out.println("BlueDartCourier.BlueDartCourier()");
	}

	@Override
	public String deliver(int oId) {
		
		System.out.println("BlueDartCourier.deliver()");
		return "BLue Dart will deliver product having product id is "+oId;
	}

}
