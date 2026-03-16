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
            System.out.printf("The deposit amount entered is negative. The $ %.2f deposit wasn't made.%n",
                    amount);
            return false;
        } else {
            this.balance += amount;
            System.out.printf("The $ %.2f deposit was made!%n",
                    amount);
            return true;
        }
    }

    // fazer o método de saque - o valor de saque precsisa ser positivo e menor ou igual ao saldo da conta.
    public boolean withdrawal(double amount) {
        if (amount < 0) {
            System.out.printf("The withdrawal amount entered is negative. The $ %.2f withdrawal wasn't made.%n",
                    amount);
            return false;
        } else if (amount > this.balance) {
            System.out.printf("The withdrawal amount exceeds the account balance. The $ %.2f withdrawal wasn't made.%n",
                    amount);
            return false;
        } else {
            this.balance -= amount;
            System.out.printf("The $ %.2f withdrawal was made!%n",
                    amount);
            return true;
        }
    }

    public void showBalance() {
        System.out.printf("%s's current balance: $ %.2f%n",
                this.name,
                this.balance);
    }

    // fazer o main com os testes
    public static void main(String[] args) {
        Account account = new Account("Ana");

        account.deposit(-400);
        account.deposit(1000);
        account.showBalance();

        account.withdrawal(1200);
        account.withdrawal(800);
        account.showBalance();
    }
}
