package org.fi.restjpa.RestJPA.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="category_0030")
public class Category 
{
	@Id
	@Column(name="categoryid")
	int CategoryId;
	
	@Column(name="categoryname")
	String CategoryName;
	
	@Column(name="categorydescription")
	String CategoryDescription;
	
	@Column(name="categoryimageurl")
	String CategoryImageUrl;

	public int getCategoryId() {
		return CategoryId;
	}

	public void setCategoryId(int categoryId) {
		CategoryId = categoryId;
	}

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

	public String getCategoryDescription() {
		return CategoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		CategoryDescription = categoryDescription;
	}

	public String getCategoryImageUrl() {
		return CategoryImageUrl;
	}

	public void setCategoryImageUrl(String categoryImageUrl) {
		CategoryImageUrl = categoryImageUrl;
	}
	
	
}
