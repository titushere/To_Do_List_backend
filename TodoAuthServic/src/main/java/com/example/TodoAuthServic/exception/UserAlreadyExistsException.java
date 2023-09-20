package com.example.TodoAuthServic.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// Use the@ResponseStatus annotation to set the exception message and status
@ResponseStatus(value = HttpStatus.CONFLICT,reason = "User already exists")

public class UserAlreadyExistsException extends  Exception{
}
