package org.fi.onlineshopping2_0030;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.fi.pojo.CartItem;

/**
 * Servlet implementation class ListCart
 */
@WebServlet("/ListCart")
public class ListCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession(false);
		if(session==null)
		{
			response.sendRedirect("login.html");
			return;
		}
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		@SuppressWarnings("unchecked")
		ArrayList<CartItem>shoppingCart = (ArrayList<CartItem>)session.getAttribute("shoppingCart");
		if(shoppingCart==null || shoppingCart.isEmpty())
		{
			out.println("Cart is Empty...");
		}
		else 
		{
			out.println("<table border='1'>");
			out.println("<tr><th>CategoryID</th><th>ProductID</th><th>Price</th></tr>");
			double total = 0.0;
			Iterator<CartItem>iter = shoppingCart.iterator();
			while(iter.hasNext())
			{
				CartItem item = iter.next();
				out.println("<tr>");
				out.println("<td>" + item.getCategoryID()+"</td>");
				out.println("<td>" + item.getProductID()+"</td>");
				out.println("<td>" + item.getProductPrice()+"</td>");
				out.println("</tr>");
				total += item.getProductPrice();
			}
			out.println("</table>");
			out.println("</br></br><b>Total :" 	+ total + "</b>");
		}
		out.println("<br/><a href='Category'>ContinueShopping</a>");
		out.println("<br/><a href='Logout'>Logout</a>");
		out.println("</body></html>");
	}

}
