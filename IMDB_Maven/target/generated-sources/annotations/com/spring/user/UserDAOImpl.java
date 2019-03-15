package com.spring.user;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.login.LoginPOJO;

public class UserDAOImpl implements UserDAO 
{
	  @Autowired
	  DataSource datasource;
	  
	  @Autowired
	  JdbcTemplate jdbcTemplate;

	public void register(UserPOJO user) 
	{
		
		
	}

	public UserPOJO validateUser(LoginPOJO login) 
	{
		
		 String sql = "select * from userRegistration where username='" + login.getEmail() + "' and password='" + login.getPassword()+ "'";
		    List<UserPOJO> users = jdbcTemplate.query(sql, new UserMapper());
		    
		    return users.size() > 0 ? users.get(0) : null;
	
	}

	
	  
	  }
