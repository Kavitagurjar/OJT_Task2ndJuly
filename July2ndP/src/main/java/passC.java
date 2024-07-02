import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class passC extends HttpServlet {
	public void doGet(HttpServletRequest rq, HttpServletResponse res) throws IOException  {
		PrintWriter pw = res.getWriter();
		pw.println("<h1>You have passed</h1>");
	}

}
