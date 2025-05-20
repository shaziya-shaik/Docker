package Demo;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request ,  HttpServletResponse response)throws ServletException , IOException {
		String name="shaziya";
		request.setAttribute("name", name);
		RequestDispatcher rd=request.getRequestDispatcher("display.jsp");
		rd.forward(request , response);
	}
	

}
