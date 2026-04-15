package com.nikhil.quantitymeasurement.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {

    private String token;           // JWT access token
    private String refreshToken;    // JWT refresh token (for getting new access token)
    private String username;        // so client knows who logged in
    private String role;            // USER or ADMIN
    private String message;         // "Login successful"
}
