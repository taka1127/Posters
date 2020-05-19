package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.RegisterDAO;
import model.RegisterUserLogic;
import model.User;

/**
 * Servlet implementation class RegisterUser
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String fowardPath = null;

		String action = request.getParameter("action");

		if(action == null) {
			fowardPath = "/WEB-INF/jsp/registerForm.jsp";
		}else if(action.equals("done")) {
			HttpSession session = request.getSession();
			User registerUser = (User)session.getAttribute("registerUser");
			RegisterUserLogic logic = new RegisterUserLogic();
			logic.execute(registerUser);

			session.removeAttribute("registerUser");

			fowardPath = "/WEB-INF/jsp/registerDone.jsp";
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(fowardPath);
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String userId = request.getParameter("userId");
		String pass = request.getParameter("pass");
		String email = request.getParameter("email");
		String name = request.getParameter("name");
		User registerUser = new User(userId, pass, email, name);

		RegisterDAO dao = new RegisterDAO();
		dao.setData(userId, pass, email, name);
		HttpSession session = request.getSession();
		session.setAttribute("registerUser", registerUser);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/registerConfirm.jsp");
		dispatcher.forward(request, response);
	}

}
