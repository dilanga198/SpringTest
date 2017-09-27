package com.uno.demo;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext contex = new FileSystemXmlApplicationContext("beans.xml");
		HelloWorld helloWorld = contex.getBean(HelloWorld.class);
		helloWorld.sayHello();
		contex.close();
	}
}
