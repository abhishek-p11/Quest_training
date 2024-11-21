package com.quest.BankAccoundManagementSystem;

public class SavingsAccount extends BankAccount {
    private final double MIN_BALANCE = 500.0;

    public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= MIN_BALANCE) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal Denied! Maintaining a minimum balance of " + MIN_BALANCE + " is required.");
        }
    }
}
