package com.parking.parkinglot.servlets;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet(name="Login" , value = "/Login")
public class Login extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        request.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        request.setAttribute("message", "Username or password incorrect");
        request.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(request, response);
    }
}

