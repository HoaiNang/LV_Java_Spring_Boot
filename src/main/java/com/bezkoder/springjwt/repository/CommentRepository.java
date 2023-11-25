package com.bezkoder.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.springjwt.models.Comments;

public interface CommentRepository extends JpaRepository<Comments, Integer> {

    
}
