package com.spring.beans;

public class Message {

	private String id;
	private String message;
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void getMsg() {
		System.out.println(id);
		System.out.println(message);
	}
}
