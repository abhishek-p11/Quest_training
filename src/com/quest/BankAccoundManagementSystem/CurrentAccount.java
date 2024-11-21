package com.quest.BankAccoundManagementSystem;

public class CurrentAccount extends BankAccount{
    private final double LIMIT = 1000.0;

    public CurrentAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() + LIMIT >= amount) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal Denied! Exceeds overdraft limit of " + LIMIT);
        }
    }
}
