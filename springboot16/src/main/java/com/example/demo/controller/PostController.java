package com.example.demo.controller;

import com.example.demo.model.Post;
import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/{id}")
    public Post getPost(@PathVariable int id) {
        return postService.getPostById(id);
    }

    @PostMapping
    public Post create(@RequestBody Post post) {
        return postService.createPost(post);
    }

    @PutMapping("/{id}")
    public String update(@PathVariable int id, @RequestBody Post post) {
        postService.updatePost(id, post);
        return "Post updated";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        postService.deletePost(id);
        return "Post deleted";
    }
   
}
