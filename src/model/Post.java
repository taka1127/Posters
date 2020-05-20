package model;

public class Post {
	private int post_id;
	private String message;
	private String image;
	private String video;

	public Post(int post_id,String message, String image, String video) {
		this.setPost_id(post_id);
		this.setMessage(message);
		this.setImage(image);
		this.setVideo(video);
	}
	public Post(String message, String image, String video) {
		this.setMessage(message);
		this.setImage(image);
		this.setVideo(video);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public int getPost_id() {
		return post_id;
	}

	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}


}
