package com.amine.microsservice.security;

public interface SecParams {
    public static final long EXP_TIME = 10*24*60*60*1000;
    public static final String SECRET = "amine@yahoo.com";
    public static final String HEADER_PREFIX = "Bearer ";
}
