package com.cave.spring.section4;

public class FileWriter implements ILogWriter{

	public void Write(String text) {
		System.out.println("Write to file: " + text);
		
	}

}
