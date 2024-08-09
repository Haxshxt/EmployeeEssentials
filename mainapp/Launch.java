package com.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.controller.MyController;

public class Launch {
public static void main(String[] args) {
	ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
	Object bean = ac.getBean("controller");
	MyController controller =(MyController) bean;
	
	controller.request();
}
}
