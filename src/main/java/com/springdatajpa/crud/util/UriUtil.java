package com.springdatajpa.crud.util;

import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

public class UriUtil {

    public static URI path() {
        return ServletUriComponentsBuilder.fromCurrentRequestUri()
                .buildAndExpand()
                .toUri();
    }
    public static URI path(Object... uriVariableValues) {
        return ServletUriComponentsBuilder.fromCurrentRequestUri()
                .buildAndExpand(uriVariableValues)
                .toUri();
    }
    public static URI uri(String path, Object... uriVariableValues) {
        return ServletUriComponentsBuilder.fromCurrentRequestUri()
                .path(path)
                .buildAndExpand(uriVariableValues)
                .toUri();
    }
}
