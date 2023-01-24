package org.fi.hibernate.secondhibernateapp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ProductId implements Serializable {
	
	
	@Column(name="ProductID")
	int productId;
	
	@Column(name="CategoryID")
	int categoryId;
	
	public ProductId() {
		
	}

	public ProductId(int categoryId ,int productId) {
		super();
		this.productId = productId;
		this.categoryId = categoryId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	

}
