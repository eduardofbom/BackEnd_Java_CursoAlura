package br.com.www.models;

public class Withdrawal extends BankingOperation{

    public Withdrawal(double value) {
        super(value);
    }

    @Override
    public void execute() {
        System.out.printf("Withdrawal of $ %.2f made.%n",
                value);
    }

}
