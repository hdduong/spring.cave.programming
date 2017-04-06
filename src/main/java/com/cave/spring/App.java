package com.cave.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.cave.spring.section4.Logger;

public class App {

	public static void main(String[] args) {
		//Person person = new Person();
		//person.speak();

		//ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		//ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/cave/spring/beans/beans.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/cave/spring/beans/beans.xml");
		//cave.spring.5/src/main/java/com/cave/spring/beans/beans.xml
		
		/*Person person  = (Person)context.getBean("person");
		
		person.setTaxId(1234);
		person.getAddress().setPostCode("01609");
		
		Person person2  = (Person)context.getBean("person");
		
		System.out.println(person.toString());
		System.out.println(person2.toString());
		
		//person.speak();
		
		Address address = (Address)context.getBean("address");
		System.out.println(address.toString());
		
		FruitBasket fruitBasket = (FruitBasket)context.getBean("fruitbasket");
		System.out.println(fruitBasket.toString());*/
		
		Logger logger = (Logger)context.getBean("logger");
		logger.writeConsole("writeConsole ");
		logger.writeFile("writeFile ");
		
		((ClassPathXmlApplicationContext)context).close();
		
	}

}
