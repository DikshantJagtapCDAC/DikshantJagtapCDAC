package org.fi.onlineshopping2_0030;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewRegister_0030
 */
@WebServlet("/Register")
public class NewRegister_0030 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String UserName = request.getParameter("UserName");
		String password = request.getParameter("password");
		String Name = request.getParameter("Name");
		String Email = request.getParameter("Email");
		String City = request.getParameter("City");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbjava","root","Dikshant@18");
			    PreparedStatement psInsert = connection.prepareStatement("insert into user_0030 values(?,?,?,?,?)" );
					
			{
				PrintWriter out = response.getWriter();
				
				out.println("<html>");
				out.println("<body>");
				
				psInsert.setString(1, UserName);
				psInsert.setString(2, password);
				psInsert.setString(3, Name);
				psInsert.setString(4, Email);
				psInsert.setString(5, City);
				
				int i = psInsert.executeUpdate();
				
				
					if( i > 0)
						// out.println("registtration succesful..")
						response.sendRedirect("login.html");
					else 
						response.sendRedirect("Register.html");
						
				
				out.println("</body>");
				out.println("</html>");
		
		    }
	}catch(SQLException e) {
    	e.printStackTrace();
    } catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
  }
}
