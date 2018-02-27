package com.Controllers;

import org.hibernate.validator.constraints.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Dao.UserDao;
import com.model.User;

@Controller

public class UserController {
	private static final String value = null;
	@Autowired
	private UserDao userDao;
	public UserController() {
		System.out.println("UserController bean is created");
		
	}
	//? Any type [ErrorClazz / User object]
	@RequestMapping(value"/registeruser",method-RequestMethod.POST)
	
	
	if(!userDao.isEmailUnique(user.getEmail())){
		ErrorClazz=new ErrorClazz(1,Email already exists..please enter different email)
	}
	
	public ResponseEntity<?> registerUser(@RequestBody User user) //user is from frontend
		userDao.registerUser(user);
		return new ResponseEntity<User>(user,HttpStatus.ok);

}
