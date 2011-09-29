package com.acm.sigapp;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class JSONServlet extends HttpServlet {
	
	PrintWriter responseWriter;
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		responseWriter = resp.getWriter();
		
		
		// This is just an example JSON response. This doesn't touch the datastore at all.
		resp.setContentType("application/json");
		responseWriter.println("{");
		responseWriter.println("\t\"Name\" : \"Eric\"");
		responseWriter.println("}");
	}
}
