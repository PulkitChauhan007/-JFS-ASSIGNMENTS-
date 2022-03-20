package com.beans;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	        String confFile = "applicationContext.xml";
	        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(confFile);
	        NetworkManager networkMng = (NetworkManager) context.getBean("netManager");
	        networkMng.readData();
	        context.close();
	    }
	}