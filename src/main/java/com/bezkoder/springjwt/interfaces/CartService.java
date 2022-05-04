package com.bezkoder.springjwt.interfaces;

import java.util.List;

import com.bezkoder.springjwt.models.Cart;

//import com.ecommerce.modal.Cart;

public interface CartService {
	
	Cart addCartToUser(Cart cart, long idUser);
	
	void deleteCart(long id);
	
	List<Cart> findCartsForUser(long idUser);
	
	Cart findCartById(long id);
	
	void removeFromCart(long idCart, long idUser);
	
	Cart findByCartName(String name);

}
