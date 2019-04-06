package com.spring.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.MapBindingResult;
import org.springframework.validation.ObjectError;

import com.spring.beans.User;
import com.spring.beansValidations.UserValidator;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		User user = context.getBean("userBean", User.class);
		user.getUserDetails();
		System.out.println();
		
		UserValidator userValidator = context.getBean("userValidator", UserValidator.class);
//		Map<String, String> map = new HashMap<String, String>();
		MapBindingResult results = new MapBindingResult(new HashMap<String, String>(), "com.spring.beans.User");
		userValidator.validate(user, results);
		List<ObjectError> list = results.getAllErrors();
		for(ObjectError error : list) {
			System.out.println(error.getDefaultMessage());
		}
	}

}
