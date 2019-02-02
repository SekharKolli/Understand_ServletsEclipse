/*
 * Purpose : Testing how to write a servlet using Eclipse
 * Date: 01-February-2019
 */
package sk.learns.ServletHelloWorld;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloWorldServlet")			// Using annotations to declare path
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HelloWorldServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.append("<h2>Served at: ").append(request.getContextPath());
		out.append("<br>");
		out.append(new Date().toString()).append("</h2>");
		
		System.out.println("-----doGet Method Called-----");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		System.out.println("-----doPost Method Called-----");
	}

}
