package org.fi.hibernate.secondhibernateapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="user_0030")
@NamedQueries({  // HQL 
	@NamedQuery(name="allUsers",query = "from Users"),
	@NamedQuery(name="userByUserName", query="select OBJECT(oUsers) from Users oUsers where oUsers.userName=:uname"),
	@NamedQuery(name="authenticateUser",query="select OBJECT(oUsers) from Users oUsers where oUsers.userName=:uname and oUsers.password=:pwd")
	})
@NamedNativeQueries({// SQL queries
	@NamedNativeQuery(name="sqlAllUsers",query ="select * from user_0030")
	
	})

public class Users {

	@Id
	@Column(name="UserName")
	String userName;
	
	@Column(name="password")
	String password;
	
	@Column(name="Name")
	String name;
	
	@Column(name="Email")
	String email;
	
	@Column(name="City")
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
	

}
