package com.fundoonotes.util;

import org.springframework.stereotype.Component;

import java.util.Base64;

@Component
public class TokenUtil {

    // Generate token using userId
    public String generateToken(Long userId) {
        return Base64.getEncoder().encodeToString(String.valueOf(userId).getBytes());
    }

    // Extract userId from token
    public Long getUserIdFromToken(String token) {
        String decoded = new String(Base64.getDecoder().decode(token));
        return Long.parseLong(decoded);
    }
}