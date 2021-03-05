package com.nt.comp;

public final class DTDC implements Courier {
	
	

	public DTDC() {
		System.out.println("DTDC Courier");
	}

	@Override
	public String deliver(int oId) {
		
		return "DTDC will deliver the produc with product id "+ oId;
	}

}
