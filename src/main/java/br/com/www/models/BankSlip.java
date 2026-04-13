package br.com.www.models;

import br.com.www.interfaces.Taxable;

public class BankSlip extends Payment implements Taxable {

    private final double taxRate;

    public BankSlip(double value) {
        super(value);
        this.taxRate = 1;
    }

    @Override
    public void confirmPayment() {
        System.out.printf("Bank slip of $ %.2f successfully generated (Fee: $ %.2f)%n",
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
