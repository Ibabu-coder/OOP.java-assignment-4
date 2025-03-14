/*
Name: Francis Njoroge
RegNo: ct101/g/19667/23
Assingment 4
BankAccount.java code
Date: 7/3/2025
 */


public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public double getBalance() {
        return balance;
    }

    // ✅ Main method to run the program
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.00);
        account.deposit(500);
        account.withdraw(200);
        System.out.println("Final Balance: $" + account.getBalance());
    }
}
