package com.intuitive.main;

import org.apache.log4j.Logger;

public class MyLogger {

	final static Logger log= Logger.getLogger(MyLogger.class);
	
	public static void main(String[] args) {
		
		
		
		log.info("I ma in log info");
		log.info("I am in main method");

	}

}
