/*
 *Author Name: Sneha Shinde
 *Date: 11/29/2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jap.controller;

import com.niit.jap.service.UserImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    private UserImpl service;

    public UserController(UserImpl service) {
        this.service = service;
    }
}
