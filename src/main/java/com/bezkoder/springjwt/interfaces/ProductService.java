package com.bezkoder.springjwt.interfaces;

import java.util.List;


import com.bezkoder.springjwt.models.Product;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

public interface ProductService {
	
	Product addProductToCategory(Product product, long idCategory);
	
	Product editProduct(Product product, long id);
	
	Product findProductById(long id);
	
	void deleteProduct(long id);
	
	List<Product> findAllProducts();
	
	List<Product> findProductsForCategory(long idCategory);
	

	Product getProduct(Long id);

}
