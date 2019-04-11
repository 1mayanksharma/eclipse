package com.spring.client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Message;

public class Test {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Message message = ctx.getBean("message", Message.class);
		
		ctx.close();
		ctx.stop();
		ctx.start();
		ctx.refresh();
//		System.out.println("----------------------------");
//		message.getMsg();
		ctx.start();
		
//		System.out.println("-----------------------------");
		
//		System.out.println("-----------------------------");
		
	}

}
