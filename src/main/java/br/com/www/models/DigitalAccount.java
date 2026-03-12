package br.com.www.models;

public class DigitalAccount {
    private double balance;

    public DigitalAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void resetBalance() {
        this.balance = 0.0;
    }

    public void showBalance() {
        System.out.printf("Current balance: R$ %.2f%n", balance);
    }

    public static void main(String[] args) {
        DigitalAccount account = new DigitalAccount(1579.42);

        account.showBalance();;
        account.resetBalance();
        account.showBalance();
    }
}
