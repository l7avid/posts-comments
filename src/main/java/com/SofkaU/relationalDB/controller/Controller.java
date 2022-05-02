package com.SofkaU.relationalDB.controller;

import com.SofkaU.relationalDB.entity.Comment;
import com.SofkaU.relationalDB.entity.Post;
import com.SofkaU.relationalDB.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/") //Especificar el endpoint que vamos a usar
public class Controller {

    @Autowired
    private PostService service;

    @GetMapping //Endpoint #1
    public List<Post> getAllPosts(){
        return service.findAllPosts();
    }

    @PostMapping()
    public Post savePost(@RequestBody Post post){
        return service.createPost(post);
    }

    @PostMapping
    public Post createComment(@RequestBody Comment comment){
        return service.createComment(comment);
    }

    @DeleteMapping
    public void deletePost(@RequestBody Post post){
        service.deletePost(post);
    }

    @DeleteMapping
    public void deleteComment(@RequestBody Comment comment){
        service.deleteComment(comment);
    }
}
