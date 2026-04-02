package br.com.www.models;

public class Media {

    protected String title;
    protected Integer yearOfRelease;

    public Media(String title, Integer yearOfRelease) {
        this.title = title;
        this.yearOfRelease = yearOfRelease;
    }

    public String getTitle() {
        return title;
    }
    public Integer getYearOfRelease() {
        return yearOfRelease;
    }

    public String generateCode() {
        String titleUpperCaseWithNoSpace = title.replace(" ", "").toUpperCase();
        return String.format("LIB-%s%d",
                titleUpperCaseWithNoSpace.substring(0,3),
                yearOfRelease);
    }

    public void showSpecifications() {
        System.out.printf("Code: %s | %s: %s%n",
                generateCode(),
                this.getClass().getSimpleName(),
                title);
    }

    public static void main(String[] args) {
        Media media1 = new Media("O Hobbit", 1937);
        Media media2 = new Media("Inception", 2010);

        System.out.println(media1.generateCode());
        System.out.println(media2.generateCode());
    }
}
