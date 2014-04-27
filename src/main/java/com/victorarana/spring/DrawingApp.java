package com.victorarana.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String[] args) {		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("/spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
	}
}