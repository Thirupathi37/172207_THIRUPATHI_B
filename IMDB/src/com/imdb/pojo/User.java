package com.imdb.pojo;

public class User 
{
    String mail;
    String password;
	public User(String mail, String password) {
		super();
		this.mail = mail;
		this.password = password;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [mail=" + mail + ", password=" + password + ", getMail()=" + getMail() + ", getPassword()="
				+ getPassword() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
    
    
}
