package com.login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.SQLException;

import com.login.Dao.LoginDao;

 // Ensure this URL pattern is unique
public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int uname = Integer.parseInt(request.getParameter("uname"));
            String pass = request.getParameter("pass");
            LoginDao dao = new LoginDao();
            if (dao.check(uname, pass)) {
                HttpSession session = request.getSession();
                session.setAttribute("uname", uname);
                response.sendRedirect("Welcome.jsp");
            } else {
                response.sendRedirect("login.jsp");
            }
        } catch (NumberFormatException e) {
            response.sendRedirect("login.jsp");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            response.sendRedirect("login.jsp");
        }
    }
}
