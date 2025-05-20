package com.DemoApp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/sq")	
public class sqServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException {
//		int k =(int) req.getAttribute("k");
//		k*=k;
//		PrintWriter out=res.getWriter();
//		out.println("hello Square="+k);
		System.out.println("called");
		int k=0;
		Cookie cookies[]= req.getCookies();
		for(Cookie c:cookies) {
			if(c.getName().equals("k")) {
				k=Integer.parseInt(c.getValue());
			}
		}
		
//		HttpSession session=req.getSession();
//		int k =(int) session.getAttribute("k");
		k*=k;
		//session.removeAttribute("k");
		PrintWriter out=res.getWriter();
		out.println("<html><body><h1>");
		out.println("hello Square="+k);
		out.println("</h1></body></html>");
	}

}
