package com.anand.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anand.webApi.dao.UserDao;
import com.anand.webApi.user.User;

@RestController
public class HelloController {
	UserDao userdao=new UserDao();
	
	@RequestMapping(method=RequestMethod.GET,path="/hello/{name}")
	public String hello(@PathVariable String name)
	{
		return "Hello and welcome to new startup mr. "+name;
	}
	
	@RequestMapping(method=RequestMethod.GET,path="/user")
	public List<User> getList()
	{
		return userdao.userList();		
	}
	
	@RequestMapping(method=RequestMethod.GET,path="/user/{id}")
	public User getUserById(@PathVariable int id)
	{
		return userdao.userById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,path="/user")
	public String saveList(@RequestBody User user)
	{
		userdao.saveUser(user);	
		return "Data Inserted Sucessfully";
	
	}
	
	@RequestMapping(method=RequestMethod.PUT,path="/user/{id}")
	public String updateList(@RequestBody User user,@PathVariable int id)
	{
		userdao.updateUser(id,user);
		return "Data Update Sucessfully";
	}
	
	@RequestMapping(method=RequestMethod.DELETE,path="/user/{id}")
	public String deleteList(@PathVariable int id)
	{
		userdao.deleteUser(id);
		return "User Delete Sucessfully";
	}
	
	

}
