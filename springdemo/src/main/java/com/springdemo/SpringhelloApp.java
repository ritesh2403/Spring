package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringhelloApp {
	public static void main(String args[]) {

	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	Coach thecoach=context.getBean("myCoach", Coach.class);
	
	System.out.println(thecoach.getDailyWorkout());
	System.out.println(thecoach.getDailyFortune());
	
	context.close();
	}
}
