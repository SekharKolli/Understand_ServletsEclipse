/*
 * Purpose : Demos the creation of accepting input and reflecting the values received with some processing
 * Date: 01-February-2019
 */
package sk.learns.formCreation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AcceptStudentDetails")
public class AcceptStudentDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AcceptStudentDetails() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
