package br.com.www.models;

import br.com.www.interfaces.Taxable;

public class CreditCard extends Payment implements Taxable {

    private final double taxRate;

    public CreditCard(double value) {
        super(value);
        this.taxRate = 3;
    }

    @Override
    public void confirmPayment() {
        System.out.printf("Payment of $ %.2f confirmed on Credit Card (Fee: $ %.2f)%n",
                value,
                calculateTax());
    }

    @Override
    public double calculateTax() {
        return value * this.taxRate/100.0;
    }

    @Override
    public double getTaxRate() {
        return taxRate;
    }

    @Override
    public double getValueWithTax() {
        return value - calculateTax();
    }

}
