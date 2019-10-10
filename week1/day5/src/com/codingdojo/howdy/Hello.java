package com.codingdojo.howdy;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
//		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession(); 
		
		String personName = (String) session.getAttribute("person");
		
		if (session.getAttribute("people") == null) {
			System.out.println("people is null");
			session.setAttribute("people", new ArrayList<String>());
		}
		
		
		ArrayList<String> people = (ArrayList<String>) session.getAttribute("people");
		
//		String[] people = { "George", "Sally", "Bob", "Holly" };
		
//		String personName = request.getParameter("name");
		
		System.out.println("Name is " + personName);
		System.out.println("People is " + people);
		
		request.setAttribute("name", personName);
		request.setAttribute("people", people);
		
		
		response.setContentType("text/html");
		
//		out.write("<h1>Hello " + name + "</h1>");
		
		RequestDispatcher view = request.getRequestDispatcher("hello.jsp");
		view.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
		
		ArrayList<String> people = (ArrayList<String>) session.getAttribute("people");
		String formPerson = request.getParameter("name");
		Integer personAge = Integer.parseInt(request.getParameter("age"));
		System.out.println("posting content people " + people + " age is " + personAge);
		people.add(formPerson);
		System.out.println("posting content " + formPerson);
		
		session.setAttribute("person", formPerson);
		
//		doGet(request, response);
		
		response.sendRedirect("/Howdy/Hello");
	}

}
