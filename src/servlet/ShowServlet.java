package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowServlet
 */
@WebServlet("/ShowServlet")
public class ShowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.getWriter().append("Served at: ").append(request.getContextPath());

	        //DB connection
	        String url = "jdbc:h2:tcp://localhost/~/posters";
	        String user ="sa";
	        String password = "";

	        try {
	            Connection connection = DriverManager.getConnection(url, user, password);
	            connection.setAutoCommit(false);
	            String sql = "SELECT * FROM POSTS WHERE POST_ID = ?;";
	            PreparedStatement statement = connection.prepareStatement(sql);
	            statement.setInt(1, Integer.parseInt(request.getParameter("POST_ID")));

	            ResultSet results = statement.executeQuery();

	            ArrayList<HashMap<String,String>> rows = new ArrayList<HashMap<String,String>>();

	            while(results.next()) {

	                int post_id = results.getInt("POST_ID");
	                request.setAttribute("POST_ID", post_id);

	                String message = results.getString("message");
	                request.setAttribute("message", message);


	                String image = results.getString("image");
	                request.setAttribute("image", image);

	                String video = results.getString("video");
	                request.setAttribute("video", video);


	            }
	            request.setAttribute("rows", rows);
	            System.out.println("-----格納されたデータ-----");
	            System.out.println(rows);
	            System.out.println("");
	            results.close();
	            statement.close();


	        } catch(Exception e) {
	            e.printStackTrace();
	        }

	        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/show.jsp");
	        dispatcher.forward(request,response);
	        System.out.println("-----表示中の画面-----");
	        System.out.println("/show?post_id=" + request.getParameter("POST_ID"));
	        System.out.println("");
	    }
}
