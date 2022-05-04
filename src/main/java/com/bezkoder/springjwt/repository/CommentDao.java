package com.bezkoder.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.springjwt.models.Comment;

//import com.ecommerce.modal.Comment;

public interface CommentDao extends JpaRepository<Comment, Long> {

}
