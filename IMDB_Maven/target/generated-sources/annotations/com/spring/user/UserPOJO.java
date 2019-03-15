package com.spring.user;

public class UserPOJO 
{
	  private String password;
	  private String email;
	  
	public UserPOJO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserPOJO(String password, String email) {
		super();
		this.password = password;
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserPOJO [password=" + password + ", email=" + email + "]";
	}
	 
	  
	
	  
}
