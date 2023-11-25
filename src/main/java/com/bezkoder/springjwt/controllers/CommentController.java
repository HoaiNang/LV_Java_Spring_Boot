package com.bezkoder.springjwt.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bezkoder.springjwt.models.Comments;
import com.bezkoder.springjwt.repository.CommentRepository;


import java.util.List;
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600, allowCredentials="true")
@RestController
@RequestMapping("/comments")
public class CommentController {
    @Autowired
    private CommentRepository commentRepository;

    @GetMapping
    
    public List<Comments> getAllComments() {
        return commentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Comments getCommentsById(@PathVariable("id") int id) {
        return commentRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Comments createComments(@RequestBody Comments comments) {
        return commentRepository.save(comments);
    }

    @PutMapping("/{id}")
    public Comments updateComments(@PathVariable("id") int id, @RequestBody Comments commentsDetails) {
        Comments comments = commentRepository.findById(id).orElse(null);
        if (comments != null) {
            comments.setUser_id(commentsDetails.getUser_id());
            comments.setDescription(commentsDetails.getDescription());
            return commentRepository.save(comments);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteComments(@PathVariable("id") int id) {
        commentRepository.deleteById(id);
    }
}
