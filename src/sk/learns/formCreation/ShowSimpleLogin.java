/*
 * Purpose : Demos the creation of accepting input and reflecting the values received with some processing
 * Date: 01-February-2019
 */
package sk.learns.formCreation;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SimpleLogin")
public class ShowSimpleLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ShowSimpleLogin() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}// EO doPost()

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		readHTMLFile(out);

	}// EO doGet()
	
	private void readHTMLFile(PrintWriter out) throws IOException {
		String filePath = "C:\\Users\\SekharMaster\\Documents\\JavaAdvanceTopics\\Understand_ServletsEclipse\\WebContent\\SampleLogin.html";
		Files.lines(Paths.get(filePath)).forEach(out::println); // Java streams to read files.
		
	}// EO methodName()

}// EOC ShowSimpleLogin
