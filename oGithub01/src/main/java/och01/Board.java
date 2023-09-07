package och01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

/**
 * Servlet implementation class Board
 */
@WebServlet("/Board")  // 주소 역할을 한다.
public class Board extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Board() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost 실행~~");
		request.setCharacterEncoding("utf-8");
		
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		Date today = new Date();
		System.out.println(today);
		
		
		response.setContentType("Text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>게시판</h1>");
		out.printf("<p>제목 : %s</p>", title);
		out.printf("<p>작성자 : %s</p>", writer);
		out.printf("<p>작성일 : %s</p>", today);
		out.printf("<p>내용 <p>%s</p>", content);
		out.println("</body></html>");
		out.close();
		
		/* 
		out.println("<html><body>");
		out.println("<h1>게시판</h1>");
		out.println("<p>제목"+ title +"</p>");
		out.println("<p>작성자"+ writer +"</p>");
		out.println("<p>작성일"+ today +"</p>");
		out.println("내용 <br><pre>" + content + "</pre>");
		out.println("</body></html>");
		out.close();
		*/
	}
}
