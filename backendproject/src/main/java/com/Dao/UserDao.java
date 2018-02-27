package com.Dao;

import com.model.User;

public interface UserDao {

	
	void registerUser(User user); 

	boolean isEmailUnique(String email);

}
