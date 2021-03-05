package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.comp.Student;

public class Setter_ConstructorInjectionTest {

	public static void main(String[] args) {
		
		BeanFactory factory=null;
		Student student = null;
		
		factory= new XmlBeanFactory(new ClassPathResource("com/nt/cnfg/applicationContext.xml"));
		student = factory.getBean("stud",Student.class);
		System.out.println(student);
	}

}
