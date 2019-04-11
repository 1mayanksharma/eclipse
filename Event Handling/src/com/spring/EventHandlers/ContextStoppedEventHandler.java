package com.spring.EventHandlers;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class ContextStoppedEventHandler implements ApplicationListener<ContextStoppedEvent> {

	@Override
	public void onApplicationEvent(ContextStoppedEvent cse) {
		cse.getSource();
		System.out.println("Context stopped event");
		
	}

}
