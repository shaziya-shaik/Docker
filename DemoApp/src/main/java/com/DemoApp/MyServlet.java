package com.DemoApp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException {
		PrintWriter out=res.getWriter();
		out.println("Hi ");
		//ServletContext ctx=getServletContext();
		ServletConfig ctx=getServletConfig();
		String str=ctx.getInitParameter("name");
		String str2=ctx.getInitParameter("Phone");
		out.println(str+str2);
		
	}

}
