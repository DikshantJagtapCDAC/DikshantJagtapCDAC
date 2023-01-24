package org.fi.hibernate.firsthibernateapp.entity;

public class Users 
{
	String userName;
	String password;
	String name;
	String email;
	String city;
	
	public Users() {
		
	}
	public Users(String userName, String password, String name, String email, String city) {
		super();
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.email = email;
		this.city = city;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Users [userName=" + userName + ", password=" + password + ", name=" + name + ", email=" + email
				+ ", city=" + city + "]";
	}

}
