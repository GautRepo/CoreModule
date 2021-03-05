package com.nt.comp;

public class LuxaryCar implements Car {
	
	private Tyre tyre;
	
	public LuxaryCar(Tyre tyre) {
		System.out.println("Luxary Car:: 1-parm Constructor");
		this.tyre=tyre;
	}

	@Override
	public void drive() {
		
		System.out.println("Driving Luxary car having tyre "+tyre.roadGrip());
		
		
		

	}

}
