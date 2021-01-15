package com.springdatajpa.crud.exception;

import com.springdatajpa.crud.util.UriUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ApiErrorResponse handleUserNotFoundException(Exception exception) {
        List<Message> messages = Arrays.asList(new Message(exception.getMessage()));
        return new ApiErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR, LocalDateTime.now(), messages, UriUtil.path());
    }

}
