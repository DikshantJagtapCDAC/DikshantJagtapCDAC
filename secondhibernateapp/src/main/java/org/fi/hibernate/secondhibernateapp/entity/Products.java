package org.fi.hibernate.secondhibernateapp.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="products_0030")
public class Products {
	
	//id
	@EmbeddedId
	ProductId pId;
	
	@Column(name="ProductName")
	String ProductName;
	
	@Column(name="ProductDescription")
	String ProductDescription;
	
	@Column(name="ProductPrice")
	String ProductPrice;
	
	@Column(name="ProductImageURL")
	String ProductImageURL;
	
	public Products() {
		
	}

	public Products(int categoryId, int productId,String productName, String productDescription, String productPrice,
			String productImageURL) {
		super();
		this.pId = new ProductId (categoryId,productId);
		this.ProductName = productName;
		this.ProductDescription = productDescription;
		this.ProductPrice = productPrice;
		this.ProductImageURL = productImageURL;
	}

	

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		this.ProductName = productName;
	}

	public String getProductDescription() {
		return ProductDescription;
	}

	public void setProductDescription(String productDescription) {
		this.ProductDescription = productDescription;
	}

	public String getProductPrice() {
		return ProductPrice;
	}

	public void setProductPrice(String productPrice) {
		this.ProductPrice = productPrice;
	}

	public String getProductImageURL() {
		return ProductImageURL;
	}

	public void setProductImageURL(String productImageURL) {
		this.ProductImageURL = productImageURL;
	}
	
	

}
