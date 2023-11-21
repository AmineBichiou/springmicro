package com.amine.microsservice.exceptions;

import org.springframework.security.core.AuthenticationException;

public class UserAccountNotEnabledException extends AuthenticationException {
    public UserAccountNotEnabledException(String msg) {
        super(msg);
    }
}

