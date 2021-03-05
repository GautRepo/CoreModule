package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Employee;
import com.nt.beans.Marks;
import com.nt.beans.Student;

public class ResolverConstructorInjection {

	public static void main(String[] args) {
		
		BeanFactory factory= null;
		Marks marks= null;
		Employee emp=null;
		Student std= null;
		
		factory= new XmlBeanFactory(new ClassPathResource("com/nt/cnfg/applicationContext.xml"));
		marks = factory.getBean("mrk",Marks.class);
		System.out.println(marks);
		System.out.println("*****************");
		
		factory= new XmlBeanFactory(new ClassPathResource("com/nt/cnfg/applicationContext.xml"));
		emp=factory.getBean("emp", Employee.class);
		System.out.println(emp);
		System.out.println("*********************");
		
		factory= new XmlBeanFactory(new ClassPathResource("com/nt/cnfg/applicationContext.xml"));
		std= factory.getBean("stud", Student.class);
		System.out.println(std);
		
		
	
	}

}
