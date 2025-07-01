package BankAccountSimulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
     private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void createAccount(Scanner scanner) {
        System.out.print("Enter Account Number: ");
        String accNum = scanner.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String accName = scanner.nextLine();
        System.out.print("Enter Initial Balance: ");
        double initialBalance = scanner.nextDouble();
        scanner.nextLine(); // clear newline
        Account newAccount = new Account(accNum, accName, initialBalance);
        accounts.add(newAccount);
        System.out.println("Account created successfully!");
    }

    public Account findAccount(String accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }

    public void deposit(Scanner scanner) {
        System.out.print("Enter Account Number: ");
        String accNum = scanner.nextLine();
        Account acc = findAccount(accNum);
        if (acc != null) {
            System.out.print("Enter amount to deposit: ");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // clear newline
            acc.deposit(amount);
        } else {
            System.out.println("Account not found!");
        }
    }

    public void withdraw(Scanner scanner) {
        System.out.print("Enter Account Number: ");
        String accNum = scanner.nextLine();
        Account acc = findAccount(accNum);
        if (acc != null) {
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // clear newline
            acc.withdraw(amount);
        } else {
            System.out.println("Account not found!");
        }
    }

    public void checkBalance(Scanner scanner) {
        System.out.print("Enter Account Number: ");
        String accNum = scanner.nextLine();
        Account acc = findAccount(accNum);
        if (acc != null) {
            System.out.println("Current Balance: $" + acc.getBalance());
        } else {
            System.out.println("Account not found!");
        }
    }

    public void printTransactionHistory(Scanner scanner) {
        System.out.print("Enter Account Number: ");
        String accNum = scanner.nextLine();
        Account acc = findAccount(accNum);
        if (acc != null) {
            acc.printTransactionHistory();
        } else {
            System.out.println("Account not found!");
        }
    }
}
