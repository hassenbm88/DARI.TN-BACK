package com.bezkoder.springjwt.Services;

import java.util.List;

import com.bezkoder.springjwt.repository.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bezkoder.springjwt.interfaces.CategoryService;
import com.bezkoder.springjwt.models.Category;
import com.bezkoder.springjwt.models.User;
import com.bezkoder.springjwt.repository.UserRepository;

//import com.ecommerce.dao.CategoryDao;
//import com.ecommerce.dao.UserDao;
//import com.ecommerce.modal.Category;
//import com.ecommerce.modal.User;
//import com.ecommerce.service.CategoryService;

@Transactional
@Component
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryDao categoryDao;

	@Autowired
	private UserRepository userDao;

	@Override
	public Category addCategoryToUser(Category category, long idUser) {
		User user = userDao.findById(idUser).orElse(null);
		user.addCategoryToUser(category);
		return categoryDao.save(category);
	}

	@Override
	public Category editCategory(Category category, long id) {
		Category existsCategory = categoryDao.findById(id).orElse(null);
		existsCategory.setName(category.getName());
		return categoryDao.save(existsCategory);
	}

	@Override
	public Category findCategoryById(long id) {
		return categoryDao.findById(id).orElse(null);
	}

	@Override
	public void deleteCategory(long id) {
		categoryDao.deleteById(id);
	}

	@Override
	public List<Category> findAllCategories() {
		return categoryDao.findAll();
	}

	@Override
	public List<Category> findCategoriesForUser(long id) {
		User user = userDao.findById(id).orElse(null);
		return user.getCategories();
	}

}
