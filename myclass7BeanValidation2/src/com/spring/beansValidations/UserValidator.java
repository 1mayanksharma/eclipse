package com.spring.beansValidations;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.spring.beans.User;

public class UserValidator implements Validator {

	private Resource resource;
	
	public void setResource(Resource resource) {
		this.resource = resource;
	}
	
	@Override
	public boolean supports(Class<?> cls) {
		return User.class.equals(cls);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		
		try {
			Properties props = PropertiesLoaderUtils.loadProperties(resource);
			User user = (User) obj;

			if (user.getUname() == null || user.getUname().equals("")) {
				errors.rejectValue("uname", "error.uname.required", props.getProperty("error.uname.required"));
			}
			if (user.getUpwd() == null || user.getUpwd().equals("")) {
				errors.rejectValue("upwd", "error.upwd.required", props.getProperty("error.upwd.required"));
			}
			if (user.getUage() == 0) {
				errors.rejectValue("uage", "error.uage.required", props.getProperty("error.uage.required"));
			}

			if (user.getUemail() == null || user.getUemail().equals("")) {
				errors.rejectValue("uemail", "error.uemail.required", props.getProperty("error.uemail.required"));
			}

			if (user.getUmobile() == null || user.getUmobile().equals("")) {
				errors.rejectValue("umobile", "error.umobile.required", props.getProperty("error.umobile.required"));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
