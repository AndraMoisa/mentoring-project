package com.application.recrutemed.controllers;

import com.application.recrutemed.model.User;
import com.application.recrutemed.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathParam("id") String userId, User newUser) {
        User user = userRepository.findById(userId).get();

        user.setFirstName(newUser.getFirstName());
        user.setSecondName(newUser.getSecondName());
        user.setEmail(newUser.getEmail());

        return userRepository.save(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteUser(@PathParam("id") String userId) {
        User user = userRepository.findById(userId).get();
        userRepository.delete(user);
        return ResponseEntity.ok().build();
    }

}
