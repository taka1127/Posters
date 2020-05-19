package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDAO {

	private final String JDBC_URL = "jdbc:h2:tcp://localhost/~/posters";
	private final String DB_USER = "sa";
	private final String DB_PASS = "";

	public void setData(String userId, String pass, String email, String name) {


		try(Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)){

//			Statement stmt = conn.createStatement();
			String sql = "INSERT INTO USERS( USER_ID, PASS, EMAIL, NAME) VALUES(?, ?, ?, ?) ";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, userId);
	        pStmt.setString(2, pass);
	        pStmt.setString(3, email);
	        pStmt.setString(4, name);
	        pStmt.executeUpdate();


		}catch (SQLException e) {
			System.out.println("SQLException:" + e.getMessage());
		}

	}

}
