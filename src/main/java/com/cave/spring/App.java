package com.cave.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		//Person person = new Person();
		//person.speak();

		//ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/cave/spring/beans/beans.xml");
		//cave.spring.5/src/main/java/com/cave/spring/beans/beans.xml
		Person person  = (Person)context.getBean("person");
		person.speak();
		
		((FileSystemXmlApplicationContext)context).close();
		
	}

}
