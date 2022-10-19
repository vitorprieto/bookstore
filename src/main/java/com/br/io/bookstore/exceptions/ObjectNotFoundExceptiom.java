package com.br.io.bookstore.exceptions;

public class ObjectNotFoundExceptiom extends RuntimeException {

    public ObjectNotFoundExceptiom(String message) {
        super(message);
    }

    public ObjectNotFoundExceptiom(String message, Throwable cause) {
        super(message, cause);
    }
}
