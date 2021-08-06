package com.study.spring.case01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// OLD
		Person person = new Person();
		person.setId(1);
		person.setName("Spring");
		System.out.println(person);
		// Spring
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person2 = (Person) ctx.getBean("person");
		System.out.println(person2);
	}

}
