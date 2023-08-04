package io.github.pappuraj.springbootsecurity.controller;

import io.github.pappuraj.springbootsecurity.service.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController

public class MyRESTcontroller {
    @Autowired
    private Users users;

    @GetMapping("/")
    public String home(){
        return "Home";
    }
    @GetMapping("/user")
    public String user(){
        return users.toString();
    }

    @PostMapping("/user")
    public String addUser(@RequestBody String user){
        return users.add(user);
    }

    @GetMapping("/currentUser")
    public String getCurrentUser(Principal principal){
        return principal.getName();
    }




}
