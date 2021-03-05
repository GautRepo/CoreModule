package com.nt.test;

public class NewInstanceTest {

	public static void main(String[] args) {
		Class c1 =null,c2=null;
		Object obj1=null,obj2=null;
		
		try {
		c1=Class.forName(args[0]);
		c2=Class.forName(args[1]);
		obj1= c1.newInstance();
		obj2=c2.newInstance();
		System.out.println(obj1);
		System.out.println("*************************");
		System.out.println(obj2);
		
		}catch(InstantiationException ie){
			ie.printStackTrace();	
		}
		catch(ClassNotFoundException cnf) {
			cnf.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
