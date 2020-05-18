package model;

import java.io.Serializable;

public class User implements Serializable{

	private String userId;
	private String pass;
	private String email;
	private String name;

	public User(String userId, String name, String email, String pass) {
		this.userId = userId;
		this.pass = pass;
		this.email = email;
		this.name = name;
	}
	public String getUserId() {
		return userId;
	}
	public String getPass() {
		return pass;
	}
	public String getEmail() {
		return email;
	}
	public String getName() {
		return name;
	}
}
