package com.bezkoder.springjwt.interfaces;

import java.util.List;

import com.bezkoder.springjwt.models.Comment;

//import com.ecommerce.modal.Comment;

public interface CommentService {
	
	Comment addCommentToProduct(Comment comment, long idProduct);
	
	Comment editComment(Comment comment, long id);
	
	Comment findCommentById(long id);
	
	void deleteComment(long id);
	
	List<Comment> findCommentsForProduct(long idProduct);
	
	List<Comment> findAllComments();	
	
}
