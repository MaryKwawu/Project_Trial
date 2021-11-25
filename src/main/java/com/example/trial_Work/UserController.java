package com.example.trial_Work;

//Perform REST using (GET, PUT, POST, DELETE) USING SPRING BOOT

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")

public class UserController   {

    @GetMapping
    public String getUsers(){
        return "Hello There";
    }

    @PostMapping
    public String addUser(){
        return "Add me";
    }

    @PutMapping
    public  String updateUsers(){
        return "Change my name";
    }

    @DeleteMapping
    public String deleteUser(){
        return "Delete price";
    }
}
