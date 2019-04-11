package com.spring.EventHandlers;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class ContextRefreshedEventHandler implements ApplicationListener<ContextRefreshedEvent> {

	@Override
	public void onApplicationEvent(ContextRefreshedEvent cre) {
		System.out.println(cre.getSource());
		System.out.println("Context refreshed");
	}

}
