package org.fi.onlineshopping2_0030;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class Category
 */
@WebServlet("/Category")
public class Category extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession(false);
		if(session==null) {
			response.sendRedirect("login.html");
		}
		
		/*
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<table border='1'>");
		out.println("<tr>");
		out.println("<th>Name</th>");
		out.println("<th>Description</th>");
		out.println("<th>Image</th>");
		out.println("</tr>");
		     
		*/
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbjava","root","Dikshant@18");
				 PreparedStatement psAllCategory = connection.prepareStatement("select * from category_0030"))
				
				{
					PrintWriter out = response.getWriter();
					
					try(ResultSet result = psAllCategory.executeQuery())
					{
		             out.println("<html><body>Welcome "+session.getAttribute("userName")+",<table border='1'>");
					    while(result.next())
					    {
						out.println("<tr>");
						out.println("<td><a href='Products?CategoryID=" +result.getInt("CategoryID")+"'>"+result.getString("categoryName")+"</a></td>");
						out.println("<td>"+result.getString("CategoryDescription")+"</td>");
						out.println("<td><img src='Images/"+result.getString("CategoryImageURL")+"' height='120px' width='120px'/></td>");
						out.println("</tr>");
					   }
					    out.println("</table>");
						out.println("</body>");
						out.println("</html>");
				  }
		      }
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
		