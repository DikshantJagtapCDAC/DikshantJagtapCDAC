package org.fi.restjpa.RestJPA.dto;

public class CategoryDTO 
{
	int CategoryId;
	
	String CategoryName;
	
	String CategoryDescription;
	
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
