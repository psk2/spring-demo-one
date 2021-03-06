package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//      Load the SPring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		//		retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach2",Coach.class);
		
		//		call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		
		//		let's call our new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		//		close the context
		context.close();
	}

}
