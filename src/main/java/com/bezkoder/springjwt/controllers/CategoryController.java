package com.bezkoder.springjwt.controllers;

import com.bezkoder.springjwt.interfaces.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.springjwt.models.Category;

//import com.ecommerce.modal.Category;
//import com.ecommerce.service.CategoryService;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@PostMapping("/addCategoryToUser/{idUser}")
	Category addCategoryToUser(@RequestBody Category category, @PathVariable long idUser) {
		return categoryService.addCategoryToUser(category, idUser);
	}

	@PutMapping("/editCategory/{id}")
	Category editCategory(@RequestBody Category category, @PathVariable long id) {
		return categoryService.editCategory(category, id);
	}

	@GetMapping("/findCategoryById/{id}")
	Category findCategoryById(@PathVariable long id) {
		return categoryService.findCategoryById(id);
	}

	@DeleteMapping("/deleteCategory/{id}")
	void deleteCategory(@PathVariable long id) {
		categoryService.deleteCategory(id);
	}

	@GetMapping("/findAllCategories")
	List<Category> findAllCategories() {
		return categoryService.findAllCategories();
	}

	@GetMapping("/findCategoriesForUser/{id}")
	List<Category> findCategoriesForUser(@PathVariable long id) {
		return categoryService.findCategoriesForUser(id);
	}

}
