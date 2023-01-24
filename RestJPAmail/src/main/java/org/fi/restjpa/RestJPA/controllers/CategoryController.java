package org.fi.restjpa.RestJPA.controllers;

import java.util.List;

import org.fi.restjpa.RestJPA.dto.CategoryDTO;
import org.fi.restjpa.RestJPA.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController 
{
	@Autowired
	CategoryService categoryService;
	
	@PostMapping("newCategory")
	public boolean addNewCategory(@RequestBody CategoryDTO dto) {
		
		return categoryService.addNewCategory(dto);
	}
	
	@GetMapping("allCategories")
	public List<CategoryDTO> getAllCategories(){
		return categoryService.allCategory();
	}
	
	@GetMapping("/{catId}")
	public CategoryDTO getCategorybyId(@PathVariable ("catId") int categoryId) {
		return categoryService.findByCategoryId(categoryId);
	}
	
	@GetMapping("categoryLike/{filter}")
	public List<CategoryDTO>categoryFilter(@PathVariable("filter")String filter){
		return categoryService.showCategoryLikeName(filter);
	}
	@GetMapping("getImageData")
	public List<CategoryDTO> categoryImages(){
		return categoryService.showCategoryImages();
	}

}
