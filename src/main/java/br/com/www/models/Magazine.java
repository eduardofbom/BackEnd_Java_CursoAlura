package br.com.www.models;

public class Magazine extends Media{

    private Integer edition;

    public Magazine(String title, Integer yearOfRelease, Integer edition) {
        super(title, yearOfRelease);
        this.edition = edition;
    }

    public Integer getEdition() {
        return edition;
    }

    @Override
    public void showSpecifications() {
        System.out.printf("Code: %s | %s: %s - Edition: %d%n",
                generateCode(),
                this.getClass().getSimpleName(),
                title,
                edition);
    }
}
