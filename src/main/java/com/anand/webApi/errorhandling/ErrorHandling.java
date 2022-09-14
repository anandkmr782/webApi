package com.anand.webApi.errorhandling;

import org.springframework.stereotype.Component;

import com.anand.webApi.user.User;

@Component
public class ErrorHandling {
	
	
	public User user;
	
	public User emptyUser()
	{
		user.id=null;
		user.name="";
		user.birthDay=null;
		
		return user;
	}

}
