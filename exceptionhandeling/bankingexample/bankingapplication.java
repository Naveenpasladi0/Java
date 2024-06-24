package exceptionhandeling.bankingexample;

import java.lang.reflect.Method;

// Step 01 - Defining Custom Exceptions
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

// Step 02 - Create the Bank Account Class
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid amount. Deposit amount must be grater than zero.");
        }
        balance += amount;
        System.out.println("Successfully deposited: $" + amount);
    }

    // Method to withdraw money
    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid amount. Withdrawal amount must be greater than zero.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Available balance: $" + balance);
        }
        balance -= amount;
        System.out.println("Successfully withdrew: $" + amount);
    }

    // Method to check balance
    public double getBalance() {
        return balance;
    }
}

public class bankingapplication {
    // Step 03 - Main Application with Exception Handling
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.00); // Initial balance of $500

        try {
            System.out.println("Initial Balance: $" + account.getBalance());
            account.deposit(200.00);// Deposit $200
            System.out.println("Balance after deposit: $" + account.getBalance());

            account.withdraw(100.00); // Withdraw $100
            System.out.println("Balance after withdrawal: $" + account.getBalance());

            account.withdraw(700.00); // Attempt to withdraw $700 (Should fail)
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println("Transaction failed:" + e.getMessage());
        }

        try {
            account.deposit(-50.00); // Attempt to deposit an invalid amount (Should fail)
        } catch (InvalidAmountException e) {
            System.out.println("Transaction failed:" + e.getMessage());
        }
        System.out.println("Final Balance: $" + account.getBalance());
    }
}