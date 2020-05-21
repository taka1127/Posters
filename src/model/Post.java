package model;

public class Post {
	private int post_id;
	private String title;
	private String message;


	public Post(int post_id, String title, String message) {
		this.setPost_id(post_id);
		this.setTitle(title);
		this.setMessage(message);
	}

	public Post(String title, String message) {
		this.setTitle(title);
		this.setMessage(message);
	}

	public String getMessage() {return message;}

	public void setMessage(String message) {this.message = message;}

	public int getPost_id() {return post_id;}

	public void setPost_id(int post_id) {this.post_id = post_id;}

	public String getTitle() {return title;}

	public void setTitle(String title) {this.title = title;}

}
