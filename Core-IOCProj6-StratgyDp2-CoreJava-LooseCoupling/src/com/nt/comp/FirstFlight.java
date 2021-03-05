package com.nt.comp;

public final class FirstFlight implements Courier {
	
	

	public FirstFlight() {
		System.out.println("FirstFlight.FirstFlight()");
	}

	@Override
	public String deliver(int oId) {
		
		System.out.println("First Flight Courier.deliver()");
		return "First Flight will deliver product having product id is "+oId;
	}

}
