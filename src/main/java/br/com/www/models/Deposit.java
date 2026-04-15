package br.com.www.models;

public class Deposit extends BankingOperation{

    public Deposit(double value) {
        super(value);
    }

    @Override
    public void execute() {
        System.out.printf("Deposit of $ %.2f made.%n",
                value);
    }

}
