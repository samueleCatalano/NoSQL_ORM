package com.nosqlorm.nosqlorm.controllers;

import com.nosqlorm.nosqlorm.entities.User;
import com.nosqlorm.nosqlorm.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/getUser")
    public List<User> getUsers(User users) {

        return userRepository.findAll();

    }

    @PostMapping("/create")
    public HttpStatus createUser(@RequestBody User user) {
        userRepository.save(user);
            return HttpStatus.OK;
    }

    @PutMapping("/update/{id}")
    public HttpStatus updateUsers(@RequestBody User user, @PathVariable String id) {
        user.setId(id);
        userRepository.save(user);
            return HttpStatus.OK;
    }

    @DeleteMapping("/delete/{id}")
    public HttpStatus deleteUsers(@PathVariable String id, User user) {
        userRepository.deleteById(id);
        return HttpStatus.OK;
    }
}
