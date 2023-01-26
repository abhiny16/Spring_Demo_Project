package com.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemo.model.Employee;

public class App {

	public static void main(String[] args) {
		System.out.println("App is running....");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_config.xml");
		
		Employee emp1 = applicationContext.getBean("emp2", Employee.class);
		System.out.println(emp1);
		
	}

}
