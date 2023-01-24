package org.fi.restjpa.RestJPA.services;

import java.util.List;

import org.fi.restjpa.RestJPA.dto.CategoryDTO;

public interface CategoryService 
{
	public boolean addNewCategory(CategoryDTO Category);
	public List<CategoryDTO> allCategory();
	public CategoryDTO findByCategoryId(int categoryId);
	public List<CategoryDTO> showCategoryLikeName(String filter);
	public List<CategoryDTO> showCategoryImages();
}
