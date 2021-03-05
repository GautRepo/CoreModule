package com.nt.comp;

public final class BlueDart implements Courier {
	
	public BlueDart() {
		System.out.println("Blue Dart Courier");
	}

	@Override
	public String deliver(int oId) {
		
		return "Blue Dart will deliver the produc with product id "+ oId;
	}

}
