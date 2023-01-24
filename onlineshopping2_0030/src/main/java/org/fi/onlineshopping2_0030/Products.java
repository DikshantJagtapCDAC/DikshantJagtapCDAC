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
 * Servlet implementation class Products
 */
@WebServlet("/Products")
public class Products extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		HttpSession session = request.getSession(false);
		if(session==null) 
		{
			response.sendRedirect("login.html");
			return;
		}
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbjava","root","Dikshant@18");
					PreparedStatement psAllProducts = connection.prepareStatement("select * from products_0030 where CategoryID=?"))
				{
		             PrintWriter out = response.getWriter();
		             int CategoryID = Integer.parseInt(request.getParameter("CategoryID"));
		             psAllProducts.setInt(1, CategoryID);
		             
		             try( ResultSet result = psAllProducts.executeQuery()) {
		            	 out.println("<html><body>Welcome "+session.getAttribute("userName")+",<table border='1'>");
		            	
		            	 while(result.next()) {
		            		 
		            		 out.println("<tr>");
		            		 out.println("<td>"+result.getString("ProductName")+"</td>");
		            		 out.println("<td>"+result.getString("ProductDescription")+"</td>");
		            		 out.println("<td>"+result.getString("ProductPrice")+"</td>");
		            		 out.println("<td>"+result.getString("ProductImageURL")+"</td>");
		            		 out.println("<td><a href='AddCart?CategoryID="+result.getInt("CategoryID")+"&ProductID="+result.getInt("ProductID")+"&ProductPrice="+result.getFloat("ProductPrice")+"'>Add To Cart</a></td>");
		            	 
		            		 out.println("</tr>");
		            	 }
		            	 out.println("</table></body></html>");	 
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
		
	


	             

