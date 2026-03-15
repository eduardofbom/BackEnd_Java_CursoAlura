package br.com.www.models;

public class BookRequest {
    private String title;
    private Integer daysLate;

    static double dailyRateInReal = 2.50;

    public BookRequest(String title, Integer daysLate) {
        this.title = title;
        this.daysLate = daysLate;
    }

    public String getTitle() {
        return title;
    }
    public Integer getDaysLate() {
        return daysLate;
    }

    public double calculateTotalFine() {
        return daysLate * dailyRateInReal;
    }

    public void showSpecifications() {
        System.out.printf("Book: %s | Late fine for %d days: $ %.2f%n",
                title, daysLate, calculateTotalFine());
    }

    public static void main(String[] args) {
        BookRequest fineCalculator = new BookRequest("Dom Casmurro", 3);
        fineCalculator.showSpecifications();
    }
}
