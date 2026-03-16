package br.com.www.models;

public class Account {
    private String name;
    private double balance;

    public Account(String name) {
        this.name = name;
        this.balance = 0.0;
    }
    public Account(String name, double startBalance) {
        this.name = name;
        this.balance = startBalance;
    }

    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount < 0) {
            System.out.println("The deposit amount entered is negative. The deposit wasn't made.");
            return false;
        } else {
            balance += amount;
            System.out.println("The deposit was made!");
            return true;
        }
    }

    // fazer o método de saque - o valor de saque precsisa ser positivo e menor ou igual ao saldo da conta.

    // fazer o main com os testes
}
