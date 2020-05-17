package test;

import dao.UserDAO;
import model.Login;
import model.User;

public class UserDAOTest {

	public static void main(String[] args) {

		testFindByLogin1();
		testFindByLogin2();
	}
	public static void testFindByLogin1() {
		Login login = new Login("1", "1234");
		UserDAO dao = new UserDAO();
		User result = dao.findByLogin(login);
		if(result != null &&
				result.getUserId().equals("1") &&
				result.getName().equals("田中テスト") &&
				result.getEmail().equals("tanaka@test.com") &&
				result.getPass().equals("1234")   ) {
			System.out.println("testFindByLogin1:成功しました");
		}else {
			System.out.println("testFindByLogin1:失敗しました");
		}
	}

	public static void testFindByLogin2() {
		Login login = new Login("tanaka", "12345");
		UserDAO dao = new UserDAO();
		User result = dao.findByLogin(login);
		if(result == null) {
			System.out.println("testFindByLogin2:成功しました");
		}else {
			System.out.println("testFindByLogin2:失敗しました");
		}
	}

}
