package com.example.topfilmsback.exception;

import com.example.topfilmsback.model.Film;

public class FilmNotFoundException extends RuntimeException {
    public FilmNotFoundException(String message) {
        super(message);
    }
}
