package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PostDAO {

	private final String JDBC_URL = "jdbc:h2:tcp://localhost/~/posters";
	private final String DB_USER = "sa";
	private final String DB_PASS = "";

	public void setData(String message, String image, String video) {


		try(Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)){

			//	Statement stmt = conn.createStatement();
			String sql = "INSERT INTO POSTS( MESSAGE, IMAGE, VIDEO) VALUES(?, ?, ?) ";
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
