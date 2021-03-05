package com.nt.comp;

public class SportsCar implements Car {
	
	private Tyre tyre;
	
	public SportsCar(Tyre tyre) {
		System.out.println("Sports Car:: 1-parm Constructor");
		this.tyre=tyre;
	}

	@Override
	public void drive() {
		
		System.out.println("Driving sports car having tyre "+tyre.roadGrip());
		
		
		

	}

}
