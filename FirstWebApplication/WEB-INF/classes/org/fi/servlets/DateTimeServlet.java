package org.fi.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateTimeServlet extends HttpServlet 
	{
		// get,post,put,delete,options,head,trace
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
					throws IOException, ServletException
		{
			PrintWriter out = response.getWriter();
			
			out.println("<html>");
			out.println("<body>");
			out.println("<h1>"+ new Date() +"</h1>");
			out.println("</body>");
			out.println("</html>");
		}
}
