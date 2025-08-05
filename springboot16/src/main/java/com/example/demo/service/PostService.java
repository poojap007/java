package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Service
public class PostService {
	
    @Autowired
    private RestTemplate restTemplate;

    private final String BASE_URL = "https://jsonplaceholder.typicode.com/posts";

    // GET
    public Post getPostById(int id) {
        return restTemplate.getForObject(BASE_URL + "/" + id, Post.class);
    }

    // POST
    public Post createPost(Post post) {
        return restTemplate.postForObject(BASE_URL, post, Post.class);
    }

    // PUT
    public void updatePost(int id, Post post) {
        restTemplate.put(BASE_URL + "/" + id, post);
    }

    // DELETE
    public void deletePost(int id) {
        restTemplate.delete(BASE_URL + "/" + id);
    }
}
