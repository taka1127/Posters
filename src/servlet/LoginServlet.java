package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.GetPostListLogic;
import model.Login;
import model.LoginLogic;
import model.Post;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 response.getWriter().append("Served at: ").append(request.getContextPath());

//	        //DB connection
//		 	String url = "jdbc:h2:tcp://localhost/~/posters";
//	        String user ="sa";
//	        String password = "";
//
//
//
//	        try {
//	            Connection connection = DriverManager.getConnection(url, user, password);
//	            connection.setAutoCommit(false);
//	            String sql = "SELECT * FROM POSTS;";
//	            PreparedStatement statement = connection.prepareStatement(sql);
//
//
//	            ResultSet results = statement.executeQuery();
//
//	            ArrayList<HashMap<String,String>> rows = new ArrayList<HashMap<String,String>>();
//
//	            while(results.next()) {
//	                HashMap<String,String> columns = new HashMap<String,String>();
//
//	                String post_id = results.getString("POST_ID");
//	                columns.put("POST_ID",post_id);
//
//	                String message = results.getString("message");
//	                columns.put("message", message);
//
//	                String image = results.getString("image");
//	                columns.put("image",image);
//
//	                String video = results.getString("video");
//	                columns.put("video",video);
//
//	                rows.add(columns);
//	            }
//	            request.setAttribute("rows", rows);
//	            results.close();
//	            statement.close();
//
//
//	        } catch(Exception e) {
//	            e.printStackTrace();
//	        }



		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		GetPostListLogic getPostListLogic = new GetPostListLogic();
		List<Post> postList = getPostListLogic.execute();
		request.setAttribute("postList", postList);

		String userId = request.getParameter("userId");
		String pass = request.getParameter("pass");

		Login login = new Login(userId, pass);
		LoginLogic bo = new LoginLogic();
		boolean result = bo.execute(login);

		if(result) {
			HttpSession session = request.getSession();
			session.setAttribute("userId", userId);

			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/top.jsp");
			dispatcher.forward(request, response);



		}else {
			response.sendRedirect("/Posters/LoginServlet");
		}



	}

}
