package com.universidade.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(PessoaNotFoundException.class)
    public ResponseEntity<String> handlePessoaNotFound(PessoaNotFoundException ex) {
        return ResponseEntity.status(404).body(ex.getMessage());
    }
}
