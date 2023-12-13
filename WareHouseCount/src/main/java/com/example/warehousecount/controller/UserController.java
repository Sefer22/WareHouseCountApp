package com.example.warehousecount.controller;

import com.example.warehousecount.Dto.AuthResponse;
import com.example.warehousecount.Dto.UserDto;
import com.example.warehousecount.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {


    private UserService userService;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody UserDto userDto) {
        userService.registerUser(userDto);
        return ResponseEntity.ok("User registered successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody UserDto userDto) {
        String token = userService.loginUser(userDto);
        return ResponseEntity.ok(new AuthResponse(token));
    }
}