package com.zymr.server.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ValidatorMain {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		 ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("validatorcontext.xml");
	     applicationContext.start();
	}

}
