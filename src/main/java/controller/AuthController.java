package com.example.jwt_demo.controller;

import com.example.jwt_demo.config.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.*;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class AuthController {

    @Autowired
    private AuthenticationManager authManager;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, String> user) {

        authManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        user.get("username"),
                        user.get("password")
                )
        );

        String token = jwtUtil.generateToken(user.get("username"));

        return Map.of("token", token);
    }

    @GetMapping("/protected")
    public String protectedRoute() {
        return "Access granted!";
    }
}