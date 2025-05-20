package com.DemoApp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/add")
public class AddServlet extends HttpServlet{
	

	
public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException {
		
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
//		System.out.println("result"+k);
//		PrintWriter out=res.getWriter();
//		out.println("result="+k);
		//request Dispatcher and redirect --> to call second server
		//session Management --> send data between different servlets
		//req.setAttribute("k", k);
//		RequestDispatcher rd=req.getRequestDispatcher("sq");
//		rd.forward(req, res);
	//	res.sendRedirect("sq?k="+k);//url rewriting
		
//		HttpSession session=req.getSession();
//		session.setAttribute("k", k);
		Cookie ccokie=new Cookie("k" , k+"");
		res.addCookie(ccokie);
		res.sendRedirect("sq");
		
		
		
	}
	

}
