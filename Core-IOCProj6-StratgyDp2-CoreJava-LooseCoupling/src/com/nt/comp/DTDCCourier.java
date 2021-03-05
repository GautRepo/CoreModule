package com.nt.comp;

public final class DTDCCourier implements Courier {
	
	

	public DTDCCourier() {
		System.out.println("BlueDartCourier.BlueDartCourier()");
	}

	@Override
	public String deliver(int oId) {
		
		System.out.println("DTDC Courier.deliver()");
		return "DTDC will deliver product having product id is "+oId;
	}

}
