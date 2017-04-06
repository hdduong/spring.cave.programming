package com.cave.spring.section4;

public class ConsoleWriter implements ILogWriter{

	public void Write(String text) {
		System.out.println(text);
		
	}
	

}
