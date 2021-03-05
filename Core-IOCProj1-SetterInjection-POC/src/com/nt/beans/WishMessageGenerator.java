package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	
	private Date date;

	public void setDate(Date date) {
		this.date = date;
	}
	
	public String generateWishMessage(String user) {
		int hour=0;
		hour = date.getHours();
		
		if(hour<12) {
			return "Good Mornning::"+user;
		}else if(hour>12 && hour<17) {
			return "Good afternoon::"+user;
		}else if(hour>17 && hour <20) {
			return "Good evening::"+user;
		}else {
		return "Good night::"+user;
		
		}
	}
	
	

}
