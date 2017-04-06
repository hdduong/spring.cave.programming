package com.cave.spring.section4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Logger {
	//@Autowired
	//@Qualifier("toconsole")
	private ConsoleWriter consoleWriter;
	
	@Autowired
	private FileWriter fileWriter;
	
	public ConsoleWriter getConsoleWriter() {
		return consoleWriter;
	}
	
	//@Autowired
	/*public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter) {
		this.consoleWriter = consoleWriter;
		this.fileWriter = fileWriter;
	}*/

	//@Autowired
	/*public Logger(FileWriter fileWriter) {
		this.fileWriter = fileWriter;
	}*/
	

	@Autowired
	@Qualifier("toconsole")// not working here
	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}
	
	public FileWriter getFileWritter() {
		return fileWriter;
	}
	
	//@Autowired
	//@Named
	public void setFileWritter(FileWriter fileWritter) {
		this.fileWriter = fileWritter;
	}
	
	public void writeConsole(String text) {
		consoleWriter.Write(text);
	}
	
	public void writeFile(String text) {
		fileWriter.Write(text);
	}
	
	//@Inject
	public void init() {
		System.out.println("at init ");
	}
}
