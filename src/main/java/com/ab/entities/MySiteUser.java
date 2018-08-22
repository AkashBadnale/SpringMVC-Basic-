package com.ab.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MySiteUser {

	private String  name;
	private String surname;
	
	@Id
	private String username;
	private String password;
	
	public MySiteUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MySiteUser(String name, String surname, String username, String password) {
		super();
		this.name = name;
		this.surname = surname;
		this.username = username;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "MySiteUser [name=" + name + ", surname=" + surname + ", username=" + username + ", password=" + password
				+ "]";
	}
	
	
}//
