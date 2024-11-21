package com.quest.BankAccoundManagementSystem;

class Deposit extends Transaction {

    public Deposit(BankAccount account) {
        super(account);
    }

    @Override
    public void processTransaction(double amount) {
        account.deposit(amount);
    }
}

