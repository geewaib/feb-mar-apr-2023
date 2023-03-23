package com.herbalife;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/square")
public class SquareServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int number = Integer.parseInt(request.getParameter("number"));
        int result = number * number;
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<h1>Square of " + number + " is " + result + "</h1>");
    }

}
