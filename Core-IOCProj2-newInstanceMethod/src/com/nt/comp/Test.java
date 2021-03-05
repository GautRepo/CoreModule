package com.nt.comp;

public class Test {
	
	private int a;
	private int b;
	private int c;
	
	static {
		System.out.println("Test static block");
	}
	
	public Test(){
		System.out.println("Test:: 0 param-constructor");	
	}
	
	public Test(int a , int b) {
		this.a=a;
		this.b=b;
		System.out.println("param-constructor");
	}

	public Test(int a, int b, int c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println("three argument constructor");
	}

	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	
	
	
	

	
	
	

}
