package com.nt.comp;

public class FirstFlight implements Courier {
	

	public FirstFlight() {
		System.out.println("FirstFlight.FirstFlight()");
	}

	@Override
	public String deliver(int oid) {
		
		return "First Flight courier will deliver" + oid + " ordered product";
	}

}
