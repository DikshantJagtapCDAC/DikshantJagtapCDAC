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
 * Servlet implementation class Authenticate_0030
 */
@WebServlet("/Authenticate")
public class Authenticate_0030 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbjava","root","Dikshant@18");
				 PreparedStatement psAuthenticate = connection.prepareStatement("select * from user_0030 where username=? and password=?");
				)
				
				{ 
				PrintWriter out = response.getWriter();
				
				out.println("<html>");
				out.println("<body>");
				
				psAuthenticate.setString(1, userName);
				psAuthenticate.setString(2, password);
				
				try(ResultSet result = psAuthenticate.executeQuery();)
					{
						if(result.next()) {
							
							HttpSession session = request.getSession(true);
							
							session.setAttribute("userName", userName);
						
						    session.setMaxInactiveInterval(60*60);
							
							response.sendRedirect("Category");
						}
						else 
							response.sendRedirect("login.html");
						//else
							//response.sendRedirect("NewUser.html");
					}
				out.println("</body>");
				out.println("</html>");
				}
			catch(SQLException sql) {
				sql.printStackTrace();
				}
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
			} catch(IOException e) {
		e.printStackTrace();
		}
   }
}

