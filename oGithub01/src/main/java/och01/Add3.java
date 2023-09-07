package och01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Add3
 */
@WebServlet("/Add3")
public class Add3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("이미 Up 내용을 수정...");
		System.out.println("doGet 여기왔네");
		//parameter 받기
		int num = Integer.parseInt(request.getParameter("num"));
		String loc = request.getParameter("loc");
		System.out.println("num ->" +num);
		System.out.println("loc ->" +loc);
		// 목표 : 1부터 누적값 전달
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum +=i;
		}
		System.out.println("sum ->" +sum);
		
		// Encoding 적용
		// request.setCharacterEncoding("utf-8");
		response.setContentType("Text/html;charset=utf-8");
		// 공식 -> 사용자 Browser에 보여주는 객체
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.printf("<h1>1부터 %d까지 합계</h1>",num);
		out.printf("<h4>LOC --> %s</h4>", loc);
		out.println(sum);
		out.println("</body></html>");
		out.close();
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost 여기왔네");
		// 시기 --> request parameter받기 전 Encoding 적용
		request.setCharacterEncoding("utf-8");
		//parameter 받기
		int num = Integer.parseInt(request.getParameter("num"));
		String loc = request.getParameter("loc");
		System.out.println("num ->" +num);
		System.out.println("loc ->" +loc);
		// 목표 : 1부터 누적값 전달
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum +=i;
		}
		System.out.println("sum ->" +sum);
		
		// Encoding 적용
		// request.setCharacterEncoding("utf-8");
		response.setContentType("Text/html;charset=utf-8");
		// 공식 -> 사용자 Browser에 보여주는 객체
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.printf("<h1>1부터 %d까지 Post합계</h1>",num);
		out.printf("<h4>LOC --> %s</h4>", loc);
		out.println(sum);
		out.println("</body></html>");
		out.close();
	}
}
