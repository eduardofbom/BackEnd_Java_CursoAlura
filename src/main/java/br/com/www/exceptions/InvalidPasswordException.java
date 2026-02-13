package br.com.www.exceptions;

public class InvalidPasswordException extends RuntimeException {
    private String message;
    public InvalidPasswordException(String message) {
        this.message = message;
    }
}
