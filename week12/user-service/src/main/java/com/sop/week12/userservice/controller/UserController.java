package com.sop.week12.userservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @GetMapping
    public String getUser(@RequestHeader(value = "id") String userId, @RequestHeader(value = "role") String role){
        return "User (ID: " + userId + ", role: " + role + ")";
    }
}
