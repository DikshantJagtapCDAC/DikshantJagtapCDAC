package org.fi.onlineshopping2_0030;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.fi.pojo.CartItem;

/**
 * Servlet implementation class AddCart
 */
@WebServlet("/AddCart")
public class AddCart extends HttpServlet {
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
		String tmp = request.getParameter("CategoryID");
		int CategoryID = Integer.parseInt(tmp);
		tmp = request.getParameter("ProductID");
		int ProductID = Integer.parseInt(tmp);
		tmp = request.getParameter("ProductPrice");
		float ProductPrice = Float.parseFloat(tmp);
		
		CartItem item = new CartItem(CategoryID,ProductID,ProductPrice);
		ArrayList<CartItem>shoppingCart=null;
		
		shoppingCart=(ArrayList<CartItem>)session.getAttribute("shoppingCart");
		
		if(shoppingCart==null)
		{
			shoppingCart = new ArrayList<>();
			session.setAttribute("shoppingCart", shoppingCart);
		}
		shoppingCart.add(item);
		response.sendRedirect("ListCart");
	}

}
