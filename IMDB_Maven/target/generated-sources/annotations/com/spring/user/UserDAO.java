package com.spring.user;


import com.spring.login.LoginPOJO;

public interface UserDAO 
{
	void register(UserPOJO user);
	UserPOJO validateUser(LoginPOJO login);
	
}


