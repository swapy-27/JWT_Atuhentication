package com.example.security.jwt.auth;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    private String email;
    private String firstname;
    private String lastname;
    private String password;
}
