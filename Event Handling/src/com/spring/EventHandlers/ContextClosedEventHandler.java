package com.spring.EventHandlers;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class ContextClosedEventHandler implements ApplicationListener<ContextClosedEvent> {

	@Override
	public void onApplicationEvent(ContextClosedEvent cse) {
		cse.getSource();
		System.out.println("Context closed event");
		
	}

}
