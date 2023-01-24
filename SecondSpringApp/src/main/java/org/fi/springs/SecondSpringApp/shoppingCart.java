package org.fi.springs.SecondSpringApp;

import org.springframework.stereotype.Component;

@Component("objCart")
public class shoppingCart implements Cart {
	
	String nameCart;

	public String getNameCart() {
		return nameCart;
	}

	public void setNameCart(String nameCart) {
		this.nameCart = nameCart;
	}

	@Override
	public void addToCart() {
		// TODO Auto-generated method stub
		System.out.println("this is the add add cart method ------- "+ getNameCart());
		
	}

	@Override
	public void listCart() {
		// TODO Auto-generated method stub
		System.out.println("this is the last cart method |||||||| .......");
		
	}
	

}
