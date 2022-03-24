package com.app.sc;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/App")
public class Appclass extends HttpServlet {


protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String pId = request.getParameter("productId");
String pName = request.getParameter("productName");
String pPrice = request.getParameter("productPrice");

HttpSession theSession = request.getSession();
theSession.setAttribute("pid", pId); theSession.setAttribute("pname",
pName);
theSession.setAttribute("pprice", pPrice);
response.sendRedirect("display.jsp");
}
}