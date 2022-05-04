package com.bezkoder.springjwt.interfaces;

import java.util.List;
//import com.ecommerce.modal.Product;

import com.bezkoder.springjwt.models.Product;

public interface ProductService {
	
	Product addProductToCategory(Product product, long idCategory);
	
	Product editProduct(Product product, long id);
	
	Product findProductById(long id);
	
	void deleteProduct(long id);
	
	List<Product> findAllProducts();
	
	List<Product> findProductsForCategory(long idCategory);
	

	Product getProduct(Long id);

}
