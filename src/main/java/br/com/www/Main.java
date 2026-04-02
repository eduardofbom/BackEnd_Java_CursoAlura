package br.com.www;

import br.com.www.models.Book;
import br.com.www.models.Ebook;
import br.com.www.models.Magazine;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("O Hobbit", 1937, "J.R.R. Tolkien");
        book.showSpecifications();

        Magazine magazine = new Magazine("National Geographic", 2021, 5);
        magazine.showSpecifications();

        Ebook ebook = new Ebook("Clean Code", 2008, "PDF");
        ebook.showSpecifications();

    }
}
