package com.example.security.jwt.auth;

import com.example.security.jwt.user.Role;
import com.example.security.jwt.user.User;

public class AuthService {

    public AuthenticateResponse register(RegisterRequest request){
       var user =User.builder()
               .email(request.getEmail())
               .firstname(request.getFirstname())
               .lastname(request.getLastname())
               .password(request.getPassword())
               .role(Role.USER)
               .build();



       return AuthenticateResponse.
               builder()
               .accessToken()
               .refreshToken()
               .build();
    }
}
