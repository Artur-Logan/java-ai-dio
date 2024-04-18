package com.arturlogan.javaaidio.exceptions.handle;

import com.arturlogan.javaaidio.exceptions.UsuarioJaCadastradoException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class EntityexceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<StandardError> handle(Exception e, HttpServletRequest request){
        StandardError standardError = new StandardError();

        standardError.setTimestamp(Instant.now());
        standardError.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        standardError.setMessage(e.getMessage());
        standardError.setPath(request.getRequestURI());

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(standardError);
    }

    @ExceptionHandler(UsuarioJaCadastradoException.class)
    public ResponseEntity<StandardError> handle(UsuarioJaCadastradoException e, HttpServletRequest request){
        StandardError standardError = new StandardError();

        standardError.setTimestamp(Instant.now());
        standardError.setStatus(HttpStatus.CONFLICT.value());
        standardError.setMessage(e.getMessage());
        standardError.setPath(request.getRequestURI());

        return ResponseEntity.status(HttpStatus.CONFLICT).body(standardError);
    }

}

