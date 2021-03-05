package com.nt.comp;

public class BudgetCar implements Car {
	
	private Tyre tyre;
	
	public BudgetCar(Tyre tyre) {
		System.out.println("Budget Car:: 1-parm Constructor");
		this.tyre=tyre;
	}

	@Override
	public void drive() {
		
		System.out.println("Driving Budget car having tyre "+tyre.roadGrip());
		
		
		

	}

}
