package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repo;

    // CREATE
    @PostMapping
    public User createUser(@RequestBody User user) {
        return repo.save(user);
    }

    // READ all
    @GetMapping
    public List<User> getAllUsers() {
        return repo.findAll();
    }

    // READ one
    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable Long id) {
        return repo.findById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        User existingUser = repo.findById(id).orElseThrow();
        existingUser.setName(user.getName());
        existingUser.setEmail(user.getEmail());
        existingUser.setAge(user.getAge());
        return repo.save(existingUser);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        repo.deleteById(id);
        return "User deleted with id: " + id;
    }
}
