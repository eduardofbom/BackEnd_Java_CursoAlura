package br.com.www.models;

public class Book extends Media {

    private String author;

    public Book(String title, Integer yearOfRelease, String author) {
        super(title, yearOfRelease);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void showSpecifications() {
        System.out.printf("Code: %s | %s: %s - Author: %s%n",
                generateCode(),
                this.getClass().getSimpleName(),
                title,
                author);
    }
}
