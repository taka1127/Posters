package model;

public class User {

	private String userId;
	private String pass;
	private String email;
	private String name;

	private User(String userId, String pass, String email, String name) {
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
