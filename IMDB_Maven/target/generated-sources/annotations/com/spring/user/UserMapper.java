package com.spring.user;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.user.UserPOJO;

class UserMapper implements RowMapper<UserPOJO> 
{
	  public UserPOJO mapRow(ResultSet rs, int arg1) throws SQLException
	  {
	    UserPOJO user = new UserPOJO();
	  
	    user.setPassword(rs.getString("password"));
	    user.setEmail(rs.getString("email"));
	 
	    return user;
	  }
}