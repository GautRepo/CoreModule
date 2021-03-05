package com.nt.comp;

public final class BlueDartCourier implements Courier {
	
	

	public BlueDartCourier() {
		
		System.out.println("BlueDartCourier.BlueDartCourier():: 0-parm constructor");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("BlueDartCourier.deliver()");
		
		return "Blue Dart courier will deliver " + oid + " ordered product";
	}

}
