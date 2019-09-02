package com.ab.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ab.model.Emp;

/**
 * Servlet implementation class ShowMassage
 */
public class ShowEmployeeData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShowEmployeeData() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		// set context type
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		Emp emp = new Emp();

		emp.setEmpId(Integer.parseInt(request.getParameter("id")));
		emp.setEmpName(request.getParameter("eName"));
		emp.setEmpType(request.getParameter("eType"));

		pw.println("<h1 style='color:blue;text-align:center'> Employee Id :::" + emp.getEmpId() + "</h1>");
		pw.println("<br><h1 style='color:blue;text-align:center'>Employee Name :::" + emp.getEmpName() + "</h1>");
		pw.println("<br><h1 style='color:blue;text-align:center'> Employee Type :::" + emp.getEmpType() + "</h1>");
		pw.println("<br><br><a href='EmpForm.html'> Home</a>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
