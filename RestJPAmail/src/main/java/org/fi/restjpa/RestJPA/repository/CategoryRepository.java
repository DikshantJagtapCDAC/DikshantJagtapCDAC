package org.fi.restjpa.RestJPA.repository;

import java.util.List;

import org.fi.restjpa.RestJPA.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> 
{
	@Query("select objCategory from caegory objCategory where objCategory.categoryName like : search%")
	public List<Category>showCategoryLikeName(@Param("search") String name);
	
	@Query(value = "select * from category_0030 where CategoryImageURL like '%.jpg' order by ategoryImageURL ",nativeQuery=true)
	public List<Category> showCategoryImagesJpg();

}
