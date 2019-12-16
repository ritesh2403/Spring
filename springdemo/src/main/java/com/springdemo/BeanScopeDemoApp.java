package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanscope-applicationContext.xml");

		Coach thecoach=context.getBean("myCoach",Coach.class);
		
		Coach alphacoach=context.getBean("myCoach",Coach.class);
		
		boolean result=(thecoach == alphacoach);
		
		System.out.println("\n unPointing to the same oject:"+result);
		
		System.out.println("\n memory location for thecoach"+thecoach);
		
		System.out.println("\n memory location for alphacoach"+alphacoach);
		
		context.close();
		
	}

}
