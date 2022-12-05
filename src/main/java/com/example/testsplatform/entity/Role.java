package com.example.testsplatform.entity;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {

    ROLE_STUDENT, ROLE_TEACHER, ROLE_ADMIN;


    @Override
    public String getAuthority() {
        return name();
    }
}
