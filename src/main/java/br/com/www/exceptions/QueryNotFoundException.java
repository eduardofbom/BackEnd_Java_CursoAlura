package br.com.www.exceptions;

public class QueryNotFoundException extends RuntimeException {
    private String message;
    public QueryNotFoundException(String message) {
        super(message);
    }
}
