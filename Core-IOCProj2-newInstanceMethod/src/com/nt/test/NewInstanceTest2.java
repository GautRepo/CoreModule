package com.nt.test;

import java.lang.reflect.Constructor;

public class NewInstanceTest2 {

	public static void main(String[] args) {
		
		Class c1 =null,c2=null;
		Object obj1=null,obj2=null;
		Constructor cons[]= null;
		try {
		c1=Class.forName(args[0]);
//		c2=Class.forName(args[0]);
		
		cons=c1.getDeclaredConstructors();
//		cons=c2.getDeclaredConstructors();
		
//		obj1=cons[0].newInstance(10,20);
		obj2=cons[0].newInstance(10,20,30);
		
		System.out.println(obj2);
		}catch(InstantiationException ie) {
			ie.printStackTrace();
		}catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
