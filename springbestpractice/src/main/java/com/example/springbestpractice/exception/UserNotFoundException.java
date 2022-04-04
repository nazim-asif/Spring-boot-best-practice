package com.example.springbestpractice.exception;

/**
 * @author: Nazim Uddin Asif
 * @version: 1.0
 */
public class UserNotFoundException extends Exception{
    public UserNotFoundException(String message) {
        super(message);
    }
}
