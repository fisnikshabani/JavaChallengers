package oop.bankchallenge;

public class AccountTest {

    public static void main(String[] args) {

        Account account = new Account(1000);
        System.out.println("The Balance is: " + account.getBalance());

        account.withdraw(100);
        System.out.println("The Balance is: " + account.getBalance());

        account.withdraw(1000);
        System.out.println("The Balance is: " + account.getBalance());

        account.deposit(-100);
        System.out.println("The Balance is: " + account.getBalance());

        account.withdraw(900);
        System.out.println("The Balance is: " + account.getBalance());
    }
}
