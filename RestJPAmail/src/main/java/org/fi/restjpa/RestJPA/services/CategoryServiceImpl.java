package org.fi.restjpa.RestJPA.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.fi.restjpa.RestJPA.dto.CategoryDTO;
import org.fi.restjpa.RestJPA.entity.Category;
import org.fi.restjpa.RestJPA.repository.CategoryRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService 
{
	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	MailService mailService;
	

	@Override
	public boolean addNewCategory(CategoryDTO Category) {
		try {
			
			Category entityCategory = new Category();
			BeanUtils.copyProperties(Category, entityCategory);
			categoryRepository.save(entityCategory);
			
			return true;
			}catch(Exception e) {
				
				mailService.sendMail("support.boot@frankelsinfotech.com","project boot exception",e.toString());
				
				return false;
			}
	}

	@Override
	public List<CategoryDTO> allCategory() {
	
		List<Category> listEntity = categoryRepository.findAll();
		List<CategoryDTO> listDTO = new ArrayList<>();
		
		for(Category entity : listEntity)
		{
			CategoryDTO dto = new CategoryDTO();
			BeanUtils.copyProperties(entity, dto);
			listDTO.add(dto);
		}
		
		return listDTO;
	}

	@Override
	public CategoryDTO findByCategoryId(int categoryId) {
		
		Optional<Category> optCategory = categoryRepository.findById(categoryId);
		Category entity = optCategory.get();
		
		CategoryDTO dto = new CategoryDTO();
		BeanUtils.copyProperties(entity, dto);
		
		return dto;
	}

	@Override
	public List<CategoryDTO> showCategoryLikeName(String filter) {
		List<Category> listEntity = categoryRepository.showCategoryLikeName(filter);
		List<CategoryDTO> listDTO = new ArrayList<>();
		
		for(Category entity : listEntity)
		{
			CategoryDTO dto = new CategoryDTO();
			BeanUtils.copyProperties(entity, dto);
			listDTO.add(dto);
		}
		
		return listDTO;
	}

	@Override
	public List<CategoryDTO> showCategoryImages() {
		List<Category> listEntity = categoryRepository.showCategoryImagesJpg();
		List<CategoryDTO> listDTO = new ArrayList<>();
		
		for(Category entity : listEntity)
		{
			CategoryDTO dto = new CategoryDTO();
			BeanUtils.copyProperties(entity, dto);
			listDTO.add(dto);
		}
		
		return listDTO;
	}

}
