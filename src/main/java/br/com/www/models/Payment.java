package br.com.www.models;

public abstract class Payment {

    protected double value;

    public Payment(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public abstract void confirmPayment();

}
