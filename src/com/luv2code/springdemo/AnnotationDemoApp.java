package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach theSwimCoach = context.getBean("swimCoach", Coach.class);

		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theSwimCoach.getDailyWorkout());
		
		// call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theSwimCoach.getDailyFortune());

		// close the context
		context.close();
	}

}
