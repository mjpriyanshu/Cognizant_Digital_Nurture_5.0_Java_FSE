package com.cognizant.springsecurityjwt.controller;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springsecurityjwt.model.AuthenticationResponse;
import com.cognizant.springsecurityjwt.util.JwtUtil;

@RestController
public class AuthenticationController {

    private final JwtUtil jwtUtil;

    public AuthenticationController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @GetMapping("/authenticate")
    public AuthenticationResponse authenticate(
            @RequestHeader("Authorization") String authHeader) {

        String username = getUser(authHeader);

        String token = jwtUtil.generateToken(username);

        return new AuthenticationResponse(token);
    }

    private String getUser(String authHeader) {

        String encoded = authHeader.substring(6);

        byte[] decoded =
                Base64.getDecoder().decode(encoded);

        String credentials =
                new String(decoded, StandardCharsets.UTF_8);

        return credentials.split(":")[0];
    }

}