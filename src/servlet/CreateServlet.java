package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PostDAO;
import model.Post;

@WebServlet("/CreateServlet")
public class CreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public CreateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.getWriter().append("Served at: ").append(request.getContextPath());


		 String message = request.getParameter("message");
         String image = request.getParameter("image");
         String video = request.getParameter("video");
         Post post = new Post(message, image, video);

//         ByteArrayOutputStream byteOut = new ByteArrayOutputStream();

//         response.setContentType( "image/jpeg" );
//         response.setContentLength( byteOut.size() );
//         OutputStream out = response.getOutputStream();
//         out.write( byteOut.toByteArray() );
//         out.close();

         PostDAO dao = new PostDAO();
 		 dao.setData(message, image, video);

// 		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
//		dispatcher.forward(request, response);



		 String forward = "/Posters/LoginServlet";
		 response.sendRedirect(forward);
		 System.out.println("-----メモを投稿しました。-----");
		 System.out.println("メッセージ: " + request.getParameter("message") + " 写真: " + request.getParameter("image"));
		 System.out.println("");
	}
}
