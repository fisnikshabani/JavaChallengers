package oop.bankchallenge;

public class Account {

    double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void deposit(double amount){
        if (amount < 0){
            System.out.println("Negative numbers are not accepted!");
        } else {
            balance += amount;
        }
    }

    void withdraw(double amount){
        if (amount > balance){
            System.out.println("The amount exceeds the balance!");
        } else {
            balance -= amount;
        }
    }

    void transfer(double transferAmount, Account recipient){
        if (transferAmount > balance){
            System.out.println("The amount exceeds the balance!");
        } else {
            this.balance -= transferAmount;
            recipient.balance += transferAmount;
        }
    }
}
