package com.techdenovo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class User
{	@Id
	private int id;
	@Column
	private String username;
	@Column
	private String password;
	@Column
	private String name;
	@Column
	private String emailId;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int id, String username, String password, String name, String emailId) {
		
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.emailId = emailId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
}
