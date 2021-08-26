package com.jbk.SpringPract.annotationAutowire;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
    public static void main( String[] args ){
    	
    	ApplicationContext context= new ClassPathXmlApplicationContext("com/jbk/SpringPract/annotationAutowire/autoConfig.xml");
    	Employee emp1=context.getBean("emp1",Employee.class);
    	System.out.println(emp1);
    	System.out.println(11111111);
    }
}