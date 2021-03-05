package com.nt.comp;

public class Student {
	private int sno;
	private String sName;
	private String sAdd;
	private float sAvg;
	
	public Student() {
		System.out.println("Student::0-param constructor ");
	}
	
	public Student(int sno, String sName, String sAdd, float sAvg) {
		System.out.println("Student.Student()::4-param constructor");
		this.sno = sno;
		this.sName = sName;
		this.sAdd = sAdd;
		this.sAvg = sAvg;
	}
	
	

	public void setSno(int sno) {
		System.out.println("Student.setSno()");
		this.sno = sno;
	}

	public void setsName(String sName) {
		System.out.println("Student.setsName()");
		this.sName = sName;
	}

	public void setsAdd(String sAdd) {
		System.out.println("Student.setsAdd()");
		this.sAdd = sAdd;
	}

	public void setsAvg(float sAvg) {
		System.out.println("Student.setsAvg()");
		this.sAvg = sAvg;
	}

	/*
	 * @Override public String toString() { return "Student [sno=" + sno +
	 * ", sName=" + sName + ", sAdd=" + sAdd + ", sAvg=" + sAvg + "]"; }
	 */
	
}
