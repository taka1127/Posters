package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PostDAO;
import model.GetPostListLogic;
import model.Post;

@WebServlet("/CreateServlet")
public class CreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public CreateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

    	GetPostListLogic getPostListLogic = new GetPostListLogic();
		List<Post> postList = getPostListLogic.execute();
		request.setAttribute("postList", postList);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/top.jsp");
		dispatcher.forward(request, response);

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.getWriter().append("Served at: ").append(request.getContextPath());



//		 int post_id = Integer.parseInt(request.getParameter("post_id"));
		 String title = request.getParameter("title");
		 String message = request.getParameter("message");
         Post post = new Post(title, message);


         PostDAO dao = new PostDAO();
 		 dao.setData(title, message);

		 String forward = "/Posters/CreateServlet";
		 response.sendRedirect(forward);

	}
}
