package br.com.www.models;

import br.com.www.interfaces.Printable;

public class Report implements Printable {

    private String title;
    private String content;

    public Report(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public void print() {
        System.out.printf("""
                Title: %s
                Content: %s%n""",
                title,
                content);
    }
}
