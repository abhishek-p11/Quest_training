package com.quest.BankAccoundManagementSystem;

class Withdraw extends Transaction {

    public Withdraw(BankAccount account) {
        super(account);
    }

    @Override
    public void processTransaction(double amount) {
        account.withdraw(amount);
    }
}

