package org.fi.hibernate.secondhibernateapp.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="category_0030")
public class Category {
	@Id
	@Column(name="CategoryID")
	int categoryId;
	
	@Column(name="CategoryName")
	String categoryName;
	
	@Column(name="CategoryDescription")
	String categoryDescription;
	
	@Column(name="CategoryImageURL")
	String categoryImageURL;
	
	
	
	public Category() {
		
	}



	public Category(int categoryId, String categoryName, String categoryDescription, String categoryImageURL) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryDescription = categoryDescription;
		this.categoryImageURL = categoryImageURL;
	}



	


	public int getCategoryId() {
		return categoryId;
	}



	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}



	public String getCategoryName() {
		return categoryName;
	}



	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}



	public String getCategoryDescription() {
		return categoryDescription;
	}



	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}



	public String getCategoryImageURL() {
		return categoryImageURL;
	}



	public void setCategoryImageURL(String categoryImageURL) {
		this.categoryImageURL = categoryImageURL;
	}
	

}
