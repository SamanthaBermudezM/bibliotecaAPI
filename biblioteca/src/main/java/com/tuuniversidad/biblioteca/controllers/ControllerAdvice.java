package com.tuuniversidad.biblioteca.controllers;

import com.tuuniversidad.biblioteca.exceptions.LibroException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(LibroException.class)
    public ResponseEntity<String> handleLibroException(LibroException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}