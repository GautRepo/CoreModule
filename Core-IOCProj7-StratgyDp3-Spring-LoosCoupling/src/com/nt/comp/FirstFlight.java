package com.nt.comp;

public final class FirstFlight implements Courier {
	
	

	public FirstFlight() {
		System.out.println("First Flight Courier");
	}

	@Override
	public String deliver(int oId) {
		
		return "First Flight will deliver the produc with product id "+ oId;
	}

}
