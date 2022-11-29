/*
 *Author Name: Sneha Shinde
 *Date: 11/29/2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jap.controller;

import com.niit.jap.domain.User;
import com.niit.jap.service.UserImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    private UserImpl service;

    public UserController(UserImpl service) {
        this.service = service;
    }

    @PostMapping("/register")
    public ResponseEntity<?> save(User user) {
        return new ResponseEntity<>(service.saveUser(user), HttpStatus.ACCEPTED);
    }

    @GetMapping("/get")
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.ACCEPTED);
    }

    @GetMapping("login")
    public ResponseEntity<?> login(User user) {
        return new ResponseEntity<>(service.getByEmailAndPassword(user.getEmail(), user.getPassword()), HttpStatus.ACCEPTED);
    }
}
