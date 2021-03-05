package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	
	private Date date;
	
	static {
		System.out.println("Wish Message generator:: static block");
	}
	
	
	public WishMessageGenerator() {
		System.out.println("0-parm constructor");
	}


	public WishMessageGenerator (Date date) {
		System.out.println("Using 1-parm constructor");
		this.date =date;
	}
	
	
	public void setDate(Date date) {
		System.out.println("WishMessageGenerator:: setter method");
		this.date = date;
	}


	public String generateWishMsg(String user) {
		int hour =0;
		hour = date.getHours();
		System.out.println("Generate Wish Message"+date);
		
		if(hour<12) 
			return "Good Morning::"+ user;
		else if(hour<18) 
			return "Good afternoon::"+user;
		else if(hour<20)
			return "Good Evening::"+user;
		else
			return "Good Night::"+user;
		
	}

}
