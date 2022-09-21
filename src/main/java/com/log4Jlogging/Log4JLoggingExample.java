package com.log4Jlogging;

//import org.apache.log4j.Logger;
//import org.slf4j.LoggerFactory;
import org.slf4j.LoggerFactory;

public class Log4JLoggingExample {

	//final static Logger logger = Logger.getLogger(Log4JLoggingExample.class);
	final static org.slf4j.Logger log = LoggerFactory.getLogger(Log4JLoggingExample.class);

	public static void main(String[] args) {

		log.info("info");
		log.debug("debug");
		log.error("error");
	}

}
