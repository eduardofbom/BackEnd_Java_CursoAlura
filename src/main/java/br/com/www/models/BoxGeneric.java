package br.com.www.models;

public class BoxGeneric<T> {
    private T content;

    public T getContent() {
        return content;
    }
    public void setContent(T content) {
        this.content = content;
    }

    public T sumContent(T value) {
        // Integer
        if (this.content instanceof Integer c && value instanceof Integer i) {
            Integer result = c + i;
            return (T) result;
        }
        // Double
        else if (this.content instanceof Double c && value instanceof Double d) {
            Double result = c + d;
            return (T) result;
        }
        // String
        else if (this.content instanceof String c && value instanceof String s) {
            String result = c + s;
            return (T) result;
        } else {
            throw new IllegalArgumentException("Unsupported type for summation");
        }
    }

}
