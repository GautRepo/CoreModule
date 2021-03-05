package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.comp.Flipkart;

public class StratgyDpTest {

	public static void main(String[] args) {
		Resource res;
		BeanFactory factory;
		Flipkart fpkt;
		//hold spring bean file 
		res = new ClassPathResource("com/nt/cnfg/applicationContext.xml");
		//creating IOC container
		factory= new XmlBeanFactory(res);
		//get target Bean object
		fpkt= factory.getBean("fpkt",Flipkart.class);
		System.out.println(fpkt.shopping(new String[] {"ice-cream","samsa","launglatta"},new float[] {25.05f,15.0f,10.0f}));
	}

}
