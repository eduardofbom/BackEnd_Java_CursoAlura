package br.com.www.models;

public class LiteraryWork {
    private String title;
    private String author;
    private Integer quantPages;

    public LiteraryWork(String title, String author, Integer quantPages) {
        this.title = title;
        this.author = author;
        this.quantPages = quantPages;
    }

    public void showSpecifications() {
        System.out.printf("\"%s\" by %s with %d pages%n",
                title, author, quantPages);
    }

    public static void main(String[] args) {
        LiteraryWork literaryWork1 = new LiteraryWork("O Guia do Mochileiro das Galáxias", "Douglas Adams", 208);
        literaryWork1.showSpecifications();
    }
}
