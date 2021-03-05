package com.nt.factory;

import com.nt.comp.ApolloTyre;
import com.nt.comp.BudgetCar;
import com.nt.comp.CEATTyre;
import com.nt.comp.Car;
import com.nt.comp.LuxaryCar;
import com.nt.comp.MRFTyre;
import com.nt.comp.SportsCar;
import com.nt.comp.Tyre;

public class CarFactory {
	
	public static Car getInstance(String type) {
		
		Tyre tyre= null;
		Car car = null;
		
		if(type.equalsIgnoreCase("sports")) {
			tyre= new MRFTyre();
			car =new SportsCar(tyre);
		}
		else if (type.equalsIgnoreCase("luxary")) {
			tyre = new CEATTyre();
			car= new LuxaryCar(tyre);
		}else if (type.equalsIgnoreCase("Buget")) {
			tyre= new ApolloTyre();
			car= new BudgetCar(tyre);
		}
		else {
			throw new IllegalArgumentException("Invalid car type");
		}
		return car;
	}

}
