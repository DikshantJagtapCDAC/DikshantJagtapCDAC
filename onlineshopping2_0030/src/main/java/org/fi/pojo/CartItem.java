package org.fi.pojo;

public class CartItem {
	
	int CategoryID;
	int ProductID;
	float ProductPrice;
	
	public CartItem()
	{
		
	}
	
	public CartItem(int CategoryID ,int ProductID ,float ProductPrice) {
		super();
		this.CategoryID = CategoryID;
		this.ProductID = ProductID;
		this.ProductPrice = ProductPrice;
	}

	public int getCategoryID() {
		return CategoryID;
	}

	public void setCategoryID(int categoryID) {
		this.CategoryID = categoryID;
	}

	public int getProductID() {
		return ProductID;
	}

	public void setProductID(int productID) {
		this.ProductID = productID;
	}

	public float getProductPrice() {
		return ProductPrice;
	}

	public void setProductPrice(float productPrice) {
		this.ProductPrice = productPrice;
	}

}
