package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {
	
	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		WishMessageGenerator target= null;
		
		
		res = new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		factory = new XmlBeanFactory(res);
		Object obj= factory.getBean("wmg");
		target=(WishMessageGenerator)obj;
		
		System.out.println(target.generateWishMessage("Gautam"));
		
		
		
		
		
		
	}

}
