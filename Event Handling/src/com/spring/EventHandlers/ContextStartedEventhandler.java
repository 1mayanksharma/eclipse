package com.spring.EventHandlers;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class ContextStartedEventhandler implements ApplicationListener<ContextStartedEvent> {

	@Override
	public void onApplicationEvent(ContextStartedEvent cse) {
		System.out.println(cse.getSource());
		System.out.println("Context started");
	}

}
