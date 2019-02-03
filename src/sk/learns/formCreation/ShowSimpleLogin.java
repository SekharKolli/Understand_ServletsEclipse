/*
 * Purpose : Demos the creation of accepting input and reflecting the values received with some processing
 * Date: 01-February-2019
 */
package sk.learns.formCreation;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

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

		myHTMLPage(out);
//		readHTMLFile(out);

	}// EO doGet()
	
	private void readHTMLFile(PrintWriter out) throws IOException {
		String filePath = "C:\\Users\\SekharMaster\\Documents\\JavaAdvanceTopics\\Understand_ServletsEclipse\\WebContent\\SampleLogin.html";
		
		Stream<String> htmlLines = Files.lines(Paths.get(filePath));
		
		htmlLines.forEach(out::println);
		
	}// EO methodName()

	private void myHTMLPage(PrintWriter out) {                                                                                 
                                                                                                                               
		out.println("<!DOCTYPE html>                                                                                           ");
		out.println("<html>                                                                                                    ");
		out.println("<head>                                                                                                    ");
		out.println("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">                                ");
		out.println("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">");
		out.println("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>              ");
		out.println("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>           ");
		out.println("</head>                                                                                                   ");
		out.println("<body>                                                                                                    ");
        out.println("                                                                                                          ");
		out.println("<div class=\"container\">                                                                                 ");
		out.println("  <h2>Basic Login Page...</h2>                                                                            ");
		out.println("  <form>                                                                                                  ");
		out.println("    <div class=\"form-group\">                                                                            ");
		out.println("      <label for=\"email\">Email:</label>                                                                 ");
		out.println("      <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Enter email\">              ");
		out.println("    </div>                                                                                                ");
		out.println("    <div class=\"form-group\">                                                                            ");
		out.println("      <label for=\"pwd\">Password:</label>                                                                ");
		out.println("      <input type=\"password\" class=\"form-control\" id=\"pwd\" placeholder=\"Enter password\">          ");
		out.println("    </div>                                                                                                ");
		out.println("    <div class=\"checkbox\">                                                                              ");
		out.println("      <label><input type=\"checkbox\"> Remember me</label>                                                ");
		out.println("    </div>                                                                                                ");
		out.println("    <button type=\"submit\" class=\"btn btn-default\">Submit</button>                                     ");
		out.println("  </form>                                                                                                 ");
		out.println("</div>                                                                                                    ");
        out.println("                                                                                                          ");
		out.println("</body>                                                                                                   ");
		out.println("</html>																								   ");	
		
		
	}// EO generateSendHTML()
}// EOC ShowSimpleLogin
