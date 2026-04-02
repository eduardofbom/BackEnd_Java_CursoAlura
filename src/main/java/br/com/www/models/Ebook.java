package br.com.www.models;

public class Ebook extends Media{

    private String format;

    public Ebook(String title, Integer yearOfRelease, String format) {
        super(title, yearOfRelease);
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public void showSpecifications() {
        System.out.printf("Code: %s | %s: %s - Format: %s%n",
                generateCode(),
                this.getClass().getSimpleName(),
                title,
                format);
    }
}
