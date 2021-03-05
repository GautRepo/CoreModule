package com.nt.comp;

public final class DTDCCourier implements Courier {
	
	

	public DTDCCourier() {
		System.out.println("DTDCCourier.DTDCCourier():: 0-parm counstructor");
	}

	@Override
	public String deliver(int oid) {
		
		return "DTDC courier will deliver " + oid + " ordered product";
	}

}
