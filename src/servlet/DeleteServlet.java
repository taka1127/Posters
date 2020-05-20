package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());

        int POST_ID = Integer.parseInt(request.getParameter("POST_ID"));

        //DB connection
        String url = "jdbc:h2:tcp://localhost/~/posters";
        String user ="sa";
        String password = "";



        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            String sql = "DELETE FROM POSTS WHERE POST_ID = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, POST_ID);
            int number = statement.executeUpdate();
        } catch(Exception e) {
            e.printStackTrace();
        }


        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/deleteDone.jsp");
		dispatcher.forward(request, response);


		}

}
