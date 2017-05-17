package com.jx372.webex.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form")
public class FromServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		
		String no = request.getParameter("no");
		String email = request.getParameter("email");
		String password = request.getParameter("password"); // getParameter() 이것말고는 받는 방법이 없다.
		String gender = request.getParameter("gender");
		String[] hobbies = request.getParameterValues("hobbies"); //여러개의 파라미터가 넘어 올때.
		String selfintro = request.getParameter("self-intro");

		System.out.println( selfintro );

		PrintWriter out = response.getWriter();
		out.println(no);
		out.println(email);
		out.println("<br>");
		out.println(password);
		out.println("<br>");
		out.println(gender);
		out.println("<br>");
		if(hobbies != null){
			for(String hobby : hobbies){
				out.println(hobby + ",");
			}
		}
		out.println("<br>");
		out.println(selfintro);
		out.println("<br>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
