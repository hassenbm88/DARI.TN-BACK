package com.bezkoder.springjwt.Services;

import java.util.Date;
import java.util.List;

import com.bezkoder.springjwt.repository.CommentDao;
import com.bezkoder.springjwt.repository.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bezkoder.springjwt.interfaces.CommentService;
import com.bezkoder.springjwt.models.Comment;
import com.bezkoder.springjwt.models.Product;

//import com.ecommerce.dao.CommentDao;
//import com.ecommerce.dao.ProductDao;
//import com.ecommerce.modal.Comment;
//import com.ecommerce.modal.Product;
//import com.ecommerce.service.CommentService;

@Transactional
@Component
public class CommentServiceImpl implements CommentService{
	
	@Autowired
	private CommentDao commentDao;
	
	@Autowired
	private ProductDao productDao;

	@Override
	public Comment addCommentToProduct(Comment comment, long idProduct) {
		Product product = productDao.findById(idProduct).orElse(null);
		comment.setAddedAt(new Date());
		product.addCommentToProduct(comment);
		return commentDao.save(comment);
	}

	@Override
	public Comment editComment(Comment comment, long id) {
		Comment existComponent = commentDao.findById(id).orElse(null);
		existComponent.setTitle(comment.getTitle());
		existComponent.setMessage(comment.getMessage());
		existComponent.setAddedAt(new Date());
		existComponent.setAddedBy(comment.getAddedBy());
		return commentDao.save(existComponent);
	}

	@Override
	public Comment findCommentById(long id) {
		return commentDao.findById(id).orElse(null);
	}

	@Override
	public void deleteComment(long id) {
		commentDao.deleteById(id);
	}

	@Override
	public List<Comment> findCommentsForProduct(long idProduct) {
		Product product = productDao.findById(idProduct).orElse(null);      
		return product.getComments();
	}

	@Override
	public List<Comment> findAllComments() {
		return commentDao.findAll();
	}
	

}
