package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Post;

public class PostDAO {

	private final String JDBC_URL = "jdbc:h2:tcp://localhost/~/posters";
	private final String DB_USER = "sa";
	private final String DB_PASS = "";

	public List<Post> findAll() {
		List<Post> postList = new ArrayList<>();


		try ( Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {
			String sql = "SELECT * FROM POSTS ";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			ResultSet rs = pStmt.executeQuery();

			while(rs.next()) {
				int post_id = rs.getInt("POST_ID");
				String message = rs.getString("MESSAGE");
				String image = rs.getString("IMAGE");
				String video = rs.getString("VIDEO");
				Post post = new Post(post_id, message, image, video);
				postList.add(post);
			}
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return postList;
	}

	public void setData(String message, String image, String video) {


		try(Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)){

			//	Statement stmt = conn.createStatement();
			String sql = "INSERT INTO POSTS(  MESSAGE, IMAGE, VIDEO ) VALUES(?, ?, ?) ";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, message);
	        pStmt.setString(2, image);
	        pStmt.setString(3, video);
	        pStmt.executeUpdate();


		}catch (SQLException e) {
			System.out.println("SQLException:" + e.getMessage());
		}
	}
}
