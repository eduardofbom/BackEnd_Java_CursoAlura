package br.com.www.models;

public class Pix extends Payment{

    public Pix(double value) {
        super(value);
    }

    @Override
    public void confirmPayment() {
        System.out.printf("Payment by Pix of $ %.2f confirmed.%n",
                value);
    }
}
