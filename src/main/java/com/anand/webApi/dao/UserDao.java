package com.anand.webApi.dao;

import java.time.LocalDate;
import java.util.*;

import org.springframework.stereotype.Component;

import com.anand.webApi.errorhandling.ErrorHandling;
import com.anand.webApi.user.User;

@Component
public class UserDao {
	public static List<User> users=new ArrayList<>();
	static {
		users.add(new User(1,"anand",LocalDate.now().minusYears(35)));
		users.add(new User(2,"ankit",LocalDate.now().minusYears(34)));
		users.add(new User(3,"aman",LocalDate.now().minusYears(30)));
		users.add(new User(4,"prince",LocalDate.now().minusYears(31)));
		users.add(new User(5,"satyam",LocalDate.now().minusYears(33)));
		users.add(new User(6,"Adity",LocalDate.now().minusYears(25)));
		users.add(new User(7,"Vivek",LocalDate.now().minusYears(40)));
		users.add(new User(8,"PJ",LocalDate.now().minusYears(21)));
		users.add(new User(9,"Call Center",LocalDate.now().minusYears(30)));
		users.add(new User(10,"Rahul Gandhi",LocalDate.now().minusYears(35)));
	}
	
	 ErrorHandling eh=new ErrorHandling();
	public List<User> userList()
	{
		return users;
	}
	
	
	public User userById(int id)
	{
		for(int i=0;i<users.size();i++)
		{
			User u=users.get(i);
			if(u.getId().equals(id))
			{
				return users.get(id-1);
			}
		}
		return eh.emptyUser();
	}
	public void saveUser(User user)
	{
		users.add(user);
	}
	public void updateUser(int id,User user)
	{
		for(int i=0;i<users.size();i++)
		{
			User u=users.get(i);
			if(u.getId().equals(id))
			{
				users.set(i,user);
			}
		}
	}
	
	public void deleteUser(int id)
	{
		for(int i=0;i<users.size();i++)
		{
			User u=users.get(i);
			if(u.getId().equals(id))
			{
				users.remove(id-1);
			}
		}
	}

}
