package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentDao extends JpaRepository<Comment, Long> {

}
