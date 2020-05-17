package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Login;
import model.User;

public class UserDAO {

	private final String JDBC_URL = "jdbc:h2:tcp://localhost/~/posters";
	private final String DB_USER = "sa";
	private final String DB_PASS = "";

	public User findByLogin(Login login) {
		User user = null;

		try(Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)){

			String sql = "SELECT USER_ID, PASS, EMAIL, NAME FROM USERS WHERE USER_ID = ? AND PASS = ?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, login.getUserId());
			pStmt.setString(2, login.getPass());

			ResultSet rs = pStmt.executeQuery();

			if(rs.next()) {
				String userId = rs.getString("USER_ID");
				String pass = rs.getString("PASS");
				String email = rs.getString("EMAIL");
				String name = rs.getString("NAME");
				user = new User(userId, pass, email, name);
			}
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return user;
	}
}
